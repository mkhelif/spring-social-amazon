package org.springframework.social.amazon.connect;

import org.springframework.social.amazon.api.Amazon;
import org.springframework.social.amazon.api.impl.AmazonTemplate;
import org.springframework.social.oauth2.AbstractOAuth2ServiceProvider;

/**
 * Amazon ServiceProvider implementation.
 *
 * @author Marwan Khelif
 */
public class AmazonServiceProvider extends AbstractOAuth2ServiceProvider<Amazon> {
    
    public AmazonServiceProvider(String clientId, String clientSecret) {
        super(new AmazonOAuth2Template(clientId, clientSecret));
    }

    /**
     * @see org.springframework.social.oauth2.AbstractOAuth2ServiceProvider#getApi(java.lang.String)
     */
    @Override
    public Amazon getApi(String accessToken) {
        return new AmazonTemplate(accessToken);
    }
}