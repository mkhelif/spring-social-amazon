package org.springframework.social.amazon.api;

/**
 * Interface defining operations for retrieving information about Amazon customer.
 *
 * @author Marwan Khelif
 */
public interface UserOperations {

    /**
     * Retrieve the customer profile of the authenticated user.
     *
     * @return the Amazon customer profile.
     */
    Profile getCustomerProfile();
}