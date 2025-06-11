package com.bexos.springoauthserver.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping
public class HelloController {

    @GetMapping("/hello")
    public String hello(@AuthenticationPrincipal OAuth2User principal) {
        String name = "";
        String email = "";

        if (principal instanceof OidcUser oidcUser) {
            name = oidcUser.getFullName();
            email = oidcUser.getEmail();
        } else {
            Map<String, Object> attributes = principal.getAttributes();
            name = (String) attributes.get("name");
            email = (String) attributes.get("email");
        }

        return "User: " + name + " --- Email: " + email;
    }

    @GetMapping("/provider")
    public String provider(OAuth2AuthenticationToken token) {
        return "Logged in via: " + token.getAuthorizedClientRegistrationId();
    }


}
