package org.springframework.social.amazon.api.impl;

import org.springframework.social.amazon.api.Amazon;
import org.springframework.social.amazon.api.UserOperations;
import org.springframework.social.oauth2.AbstractOAuth2ApiBinding;

/**
 * This is the central class for interacting with Amazon.
 *
 * @author Marwan Khelif
 */
public class AmazonTemplate extends AbstractOAuth2ApiBinding implements Amazon {

    private UserOperations userOperations;
    
    public AmazonTemplate() {
        super();
        this.initialize();
    }
    
    public AmazonTemplate(String accessToken) {
        super(accessToken);
        this.initialize();
    }
    
    private void initialize() {
        userOperations = new UserTemplate(getRestTemplate(), isAuthorized());
    }
    
    /**
     * @see org.springframework.social.amazon.api.Amazon#userOperations()
     */
    @Override
    public UserOperations userOperations() {
        return userOperations;
    }
}