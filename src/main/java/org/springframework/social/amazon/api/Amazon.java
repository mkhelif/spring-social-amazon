package org.springframework.social.amazon.api;

import org.springframework.social.ApiBinding;

/**
 * Interface specifying a basic set of operations for interacting with Amazon.
 * Implemented by AmazonTemplate.
 *
 * @author Marwan Khelif
 */
public interface Amazon extends ApiBinding {

    /**
     * @return the portion of the Amazon API containing the user operations.
     */
    UserOperations userOperations();
}