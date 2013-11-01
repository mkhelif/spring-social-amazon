package org.springframework.social.amazon.api.impl;

import org.springframework.social.amazon.api.Profile;
import org.springframework.social.amazon.api.ProfileRequest;
import org.springframework.social.amazon.api.UserOperations;

/**
 * Implementation of Amazon user operations.
 *
 * @author Marwan Khelif
 */
class UserTemplate extends AbstractAmazonOperations implements UserOperations {
    
    private final AmazonTemplate template;
    
    public UserTemplate(final AmazonTemplate template, final boolean authorized) {
        super(authorized);
        this.template = template;
    }

    @Override
    public Profile getCustomerProfile() {
        requireAuthorization();
        return template.fetchObject("/user/profile", ProfileRequest.class).getProfile();
    }
}