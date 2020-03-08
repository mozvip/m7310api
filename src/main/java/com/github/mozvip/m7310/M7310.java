package com.github.mozvip.m7310;

import com.github.mozvip.m7310.responses.APIResponse;
import com.github.mozvip.m7310.responses.AuthAPIResponse;
import com.github.mozvip.m7310.responses.MessageResponse;
import com.github.mozvip.m7310.responses.StatusResponse;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import okhttp3.*;
import org.apache.commons.codec.binary.Hex;

import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class M7310 {

    OkHttpClient client;
    String token;

    private final Gson gson = new GsonBuilder().create();

    public static final MediaType JSON
            = MediaType.get("application/json; charset=utf-8");

    private String baseURL;

    protected String post(String url, String json) throws IOException {
        RequestBody body = RequestBody.create(json, JSON);
        Request request = new Request.Builder()
                .url(baseURL + url)
                .post(body)
                .build();
        try (Response response = client.newCall(request).execute()) {
            return response.body().string();
        }
    }

    public AuthAPIResponse adminLogin(String password) throws IOException, NoSuchAlgorithmException {
        // first post
        final String responseAction0 = post("/cgi-bin/auth_cgi", "{\"module\":\"authenticator\",\"action\":0}");
        final AuthAPIResponse authResponse = gson.fromJson(responseAction0, AuthAPIResponse.class);

        String digest = String.format("%s:%s", password, authResponse.getNonce());
        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] hash = md.digest(digest.getBytes());

        // second post
        final String s = String.format("{\"module\":\"authenticator\",\"action\":1,\"digest\":\"%s\"}", Hex.encodeHexString(hash));
        final String responseAction1 = post("/cgi-bin/auth_cgi", s);
        final AuthAPIResponse authResponse1 = gson.fromJson(responseAction1, AuthAPIResponse.class);

        this.token = authResponse1.getToken();

        return authResponse1;
    }

    public MessageResponse getMessages(int pageNumber) throws IOException {
        String body = String.format("{\"token\":\"%s\",\"module\":\"message\",\"action\":2,\"pageNumber\":%d,\"amountPerPage\":8,\"box\":0}", token, pageNumber);
        final String response = post("/cgi-bin/web_cgi", body);

        final MessageResponse messageResponse = gson.fromJson(response, MessageResponse.class);
        return messageResponse;
    }

    public APIResponse sendMessage(String to, String textContent) throws IOException {
        //String sendTime = "2020,3,8,10,41,21";

        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy,M,d,h,m,s");
        String sendTime = LocalDateTime.now().format(df);

        final String body = String.format("{\"token\":\"%s\",\"module\":\"message\",\"action\":3,\"sendMessage\":{\"to\":\"%s\",\"textContent\":\"%s\",\"sendTime\":\"%s\"}}", token, to, textContent, sendTime);
        final String response = post("/cgi-bin/web_cgi", body);
        return gson.fromJson(response, APIResponse.class);
    }

    public StatusResponse getStatus() throws IOException {
        String body = String.format("{\"token\":\"%s\",\"module\":\"status\",\"action\":0}", token);
        final String responseStatus = post("/cgi-bin/web_cgi", body);

        final StatusResponse statusResponse = gson.fromJson(responseStatus, StatusResponse.class);
        return statusResponse;
    }

    public M7310(String ipAddress, String password) throws IOException, NoSuchAlgorithmException {
        client = new OkHttpClient();
        baseURL = String.format("http://%s", ipAddress);

        adminLogin(password);
    }

}
