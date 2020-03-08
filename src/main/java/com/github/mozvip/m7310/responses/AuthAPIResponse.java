package com.github.mozvip.m7310.responses;

public class AuthAPIResponse extends APIResponse {
    private String authedIP;
    private String nonce;
    private String token;
    private boolean factoryDefault;

    public String getAuthedIP() {
        return authedIP;
    }

    public void setAuthedIP(String authedIP) {
        this.authedIP = authedIP;
    }

    public String getNonce() {
        return nonce;
    }

    public void setNonce(String nonce) {
        this.nonce = nonce;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public boolean isFactoryDefault() {
        return factoryDefault;
    }

    public void setFactoryDefault(boolean factoryDefault) {
        this.factoryDefault = factoryDefault;
    }
}
