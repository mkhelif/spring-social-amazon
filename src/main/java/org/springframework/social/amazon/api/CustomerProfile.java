package org.springframework.social.amazon.api;

import java.io.Serializable;

/**
 * Model class representing a Amazon's customer profile information.
 *
 * @author Marwan Khelif
 */
public class CustomerProfile implements Serializable {

    /**
     * Amazon unique identifier of the account.
     */
    private String id;
    
    /**
     * Name of the customer as registered in Amazon.
     */
    private String name;

    /**
     * Email address of the customer as registered in Amazon.
     */
    private String email;

    /**
     * Postal code of the customer as registered in Amazon.
     */
    private String postalCode;
    
    public CustomerProfile() {
        super();
    }
    
    public String getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
    
    public String getPostalCode() {
        return postalCode;
    }
    
    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
}