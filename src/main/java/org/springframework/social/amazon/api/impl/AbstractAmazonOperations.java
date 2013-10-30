package org.springframework.social.amazon.api.impl;

import org.springframework.social.MissingAuthorizationException;

/**
 * Abstract operations for Amazon.
 *
 * @author Marwan Khelif
 */
abstract class AbstractAmazonOperations {
    
    protected static final String API_URL = "https://www.amazon.com/ap";

    private final boolean authorized;
    
    public AbstractAmazonOperations(boolean authorized) {
        this.authorized = authorized;
    }
    
    /**
     * Check authentication before trying to execute operation.
     */
    protected final void requireAuthorization() {
        if (!authorized) {
            throw new MissingAuthorizationException("amazon");
        }
    }
}