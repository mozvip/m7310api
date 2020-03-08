package com.github.mozvip.m7310;

import com.github.mozvip.m7310.responses.APIResponse;
import com.github.mozvip.m7310.responses.MessageResponse;
import com.github.mozvip.m7310.responses.StatusResponse;
import org.junit.jupiter.api.BeforeAll;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class M7310Test {

    static M7310 m;

    @BeforeAll
    static void beforeAll() throws IOException, NoSuchAlgorithmException {
        m = new M7310(System.getenv("ROUTER_IP"), System.getenv("PASSWORD"));
    }

    @org.junit.jupiter.api.Test
    void adminLogin() throws IOException, NoSuchAlgorithmException {
        assertTrue(m.token != null);
    }

    @org.junit.jupiter.api.Test
    void getStatus() throws IOException, NoSuchAlgorithmException {
        final StatusResponse status = m.getStatus();
        assertTrue(status != null);
    }

    @org.junit.jupiter.api.Test
    void getMessages() throws IOException, NoSuchAlgorithmException {
        final MessageResponse response = m.getMessages(1);
        assertTrue(response != null);
        final MessageResponse r = m.getMessages(2);
        assertTrue(r != null);
    }

    @org.junit.jupiter.api.Test
    void sendMessage() throws IOException, NoSuchAlgorithmException {
        final APIResponse apiResponse = m.sendMessage(System.getenv("DEST_NUMBER"), "Coucou c'est l'API");
        assertEquals(0, apiResponse.getResult());
    }

}