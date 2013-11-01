package org.springframework.social.amazon.api.impl;

import org.springframework.social.MissingAuthorizationException;

/**
 * Abstract operations for Amazon.
 *
 * @author Marwan Khelif
 */
abstract class AbstractAmazonOperations {

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