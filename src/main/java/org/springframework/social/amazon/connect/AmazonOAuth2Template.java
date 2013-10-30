package org.springframework.social.amazon.connect;

import org.springframework.social.oauth2.OAuth2Template;

/**
 * Template for OAuth2 operations with Amazon.
 *
 * @author Marwan Khelif
 */
public class AmazonOAuth2Template extends OAuth2Template {
    
    public AmazonOAuth2Template(String clientId, String clientSecret) {
        super(clientId, clientSecret, "https://www.amazon.com/ap/oa", "https://api.amazon.com/auth/O2/tokeninfo");
    }
}