package org.springframework.social.amazon.api;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Model class representing a Amazon's customer profile information.
 *
 * @author Marwan Khelif
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class Profile implements Serializable {

    /**
     * Amazon unique identifier of the account.
     */
    @JsonProperty("CustomerId")
    private String customerId;
    
    /**
     * Name of the customer as registered in Amazon.
     */
    @JsonProperty("Name")
    private String name;

    /**
     * Email address of the customer as registered in Amazon.
     */
    @JsonProperty("PrimaryEmail")
    private String primaryEmail;

    /**
     * Postal code of the customer as registered in Amazon.
     */
    private String postalCode;
    
    public Profile() {
        super();
    }
    
    public String getCustomerId() {
        return customerId;
    }
    
    public String getName() {
        return name;
    }

    public String getPrimaryEmail() {
        return primaryEmail;
    }
    
    public String getPostalCode() {
        return postalCode;
    }
    
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrimaryEmail(String primaryEmail) {
        this.primaryEmail = primaryEmail;
    }
    
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
}