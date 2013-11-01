package org.springframework.social.amazon.api.impl;

import java.net.URI;

import org.springframework.social.amazon.api.Amazon;
import org.springframework.social.amazon.api.UserOperations;
import org.springframework.social.oauth2.AbstractOAuth2ApiBinding;
import org.springframework.social.support.URIBuilder;

/**
 * This is the central class for interacting with Amazon.
 *
 * @author Marwan Khelif
 */
public class AmazonTemplate extends AbstractOAuth2ApiBinding implements Amazon {
    
    private static final String API_URL = "https://www.amazon.com/ap";
    
    private final String accessToken;
    
    private UserOperations userOperations;
    
    public AmazonTemplate() {
        this(null);
    }
    
    public AmazonTemplate(String accessToken) {
        super(accessToken);
        this.initialize();

        this.accessToken = accessToken;
    }
    
    private void initialize() {
        userOperations = new UserTemplate(this, isAuthorized());
    }
    
    /**
     * @see org.springframework.social.amazon.api.Amazon#userOperations()
     */
    @Override
    public UserOperations userOperations() {
        return userOperations;
    }
    
    /**
     * Retrieve an Object from Amazon.
     * To authenticate the request, Amazon is expecting the access token to be set as a parameter.
     */
    protected <T> T fetchObject(final String path, final Class<T> type) {
        URI url = URIBuilder.fromUri(API_URL + path).queryParam("access_token", accessToken).build();
        return getRestTemplate().getForObject(url, type);
    }
}