package org.springframework.social.amazon.api.impl;

import org.springframework.social.amazon.api.CustomerProfile;
import org.springframework.social.amazon.api.UserOperations;
import org.springframework.web.client.RestTemplate;

/**
 * Implementation of Amazon user operations.
 *
 * @author Marwan Khelif
 */
class UserTemplate extends AbstractAmazonOperations implements UserOperations {
    
    private final RestTemplate restTemplate;
    
    public UserTemplate(final RestTemplate restTemplate, final boolean authorized) {
        super(authorized);
        this.restTemplate = restTemplate;
    }

    @Override
    public CustomerProfile getCustomerProfile() {
        requireAuthorization();
        return restTemplate.getForObject(API_URL + "/user/profile", CustomerProfile.class);
    }
}