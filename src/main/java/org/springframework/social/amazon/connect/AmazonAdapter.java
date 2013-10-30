package org.springframework.social.amazon.connect;

import org.springframework.social.ApiException;
import org.springframework.social.amazon.api.Amazon;
import org.springframework.social.amazon.api.CustomerProfile;
import org.springframework.social.connect.ApiAdapter;
import org.springframework.social.connect.ConnectionValues;
import org.springframework.social.connect.UserProfile;
import org.springframework.social.connect.UserProfileBuilder;

/**
 * Amazon ApiAdapter implementation.
 *
 * @author Marwan Khelif
 */
public class AmazonAdapter implements ApiAdapter<Amazon> {

    @Override
    public boolean test(Amazon api) {
        try {
            api.userOperations().getCustomerProfile();
            return true;
        } catch (final ApiException e) {
            return false;
        }
    }

    @Override
    public void setConnectionValues(Amazon api, ConnectionValues values) {
        CustomerProfile profile = api.userOperations().getCustomerProfile();
        values.setProviderUserId(profile.getId());
        values.setDisplayName(profile.getName());
    }

    @Override
    public UserProfile fetchUserProfile(Amazon api) {
        CustomerProfile profile = api.userOperations().getCustomerProfile();
        UserProfileBuilder builder = new UserProfileBuilder();
        builder.setName(profile.getName());
        builder.setUsername(profile.getName());
        builder.setEmail(profile.getEmail());
        return builder.build();
    }

    @Override
    public void updateStatus(Amazon api, String message) {
        throw new UnsupportedOperationException("updateStatus method not supported by Amazon API");        
    }
}