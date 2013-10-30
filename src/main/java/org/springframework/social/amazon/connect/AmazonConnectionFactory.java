package org.springframework.social.amazon.connect;

import org.springframework.social.amazon.api.Amazon;
import org.springframework.social.connect.support.OAuth2ConnectionFactory;

/**
 * Amazon OAuth 2 connection factory. 
 *
 * @author Marwan Khelif
 */
public class AmazonConnectionFactory extends OAuth2ConnectionFactory<Amazon> {
    
    public AmazonConnectionFactory(String consumerKey, String consumerSecret) {
        super("Amazon", new AmazonServiceProvider(consumerKey, consumerSecret), new AmazonAdapter());
    }
}