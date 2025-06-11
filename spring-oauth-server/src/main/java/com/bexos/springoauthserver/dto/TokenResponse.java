package com.bexos.springoauthserver.dto;

public class TokenResponse {
    String accessToken;
    String idToken;

    public TokenResponse(String accessToken, String idToken) {
        this.accessToken = accessToken;
        this.idToken = idToken;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public String getIdToken() {
        return idToken;
    }
}
