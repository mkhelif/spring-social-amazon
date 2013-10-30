package org.springframework.social.amazon.security;

import org.springframework.social.amazon.api.Amazon;
import org.springframework.social.amazon.connect.AmazonConnectionFactory;
import org.springframework.social.security.provider.OAuth2AuthenticationService;

/**
 * Authentication service using Login with Amazon API to authenticate users.
 *
 * @author Marwan Khelif
 */
public class AmazonAuthenticationService extends OAuth2AuthenticationService<Amazon> {

    public AmazonAuthenticationService(String apiKey, String appSecret) {
        super(new AmazonConnectionFactory(apiKey, appSecret));
        this.setDefaultScope("profile");
    }
}