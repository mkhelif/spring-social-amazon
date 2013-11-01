package org.springframework.social.amazon.api;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response of a profile request to Amazon API.
 *
 * @author Marwan Khelif
 */
public class ProfileRequest {

    @JsonProperty("Request-Id")
    private String requestId;
    
    @JsonProperty("Profile")
    private Profile profile;
    
    public ProfileRequest() {
        super();
    }
    
    public String getRequestId() {
        return requestId;
    }
    
    public Profile getProfile() {
        return profile;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }
    
    public void setProfile(Profile profile) {
        this.profile = profile;
    }
}