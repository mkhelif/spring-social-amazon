package org.springframework.social.amazon.config.support;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.social.UserIdSource;
import org.springframework.social.amazon.api.Amazon;
import org.springframework.social.amazon.api.impl.AmazonTemplate;
import org.springframework.social.config.xml.ApiHelper;
import org.springframework.social.connect.Connection;
import org.springframework.social.connect.UsersConnectionRepository;

/**
 * Amazon ApiHelper implementation.
 *
 * @author Marwan Khelif
 */
public class AmazonApiHelper implements ApiHelper<Amazon> {
    
    private final static Log logger = LogFactory.getLog(AmazonApiHelper.class);

    private final UsersConnectionRepository usersConnectionRepository;

    private final UserIdSource userIdSource;
    
    public AmazonApiHelper(UsersConnectionRepository usersConnectionRepository, UserIdSource userIdSource) {
        this.usersConnectionRepository = usersConnectionRepository;
        this.userIdSource = userIdSource;
    }
    
    /**
     * @see org.springframework.social.config.xml.ApiHelper#getApi()
     */
    @Override
    public Amazon getApi() {
        if (logger.isDebugEnabled()) {
            logger.debug("Getting API binding instance for Amazon");
        }
        
        Connection<Amazon> connection = usersConnectionRepository.createConnectionRepository(userIdSource.getUserId()).findPrimaryConnection(Amazon.class);
        if (logger.isDebugEnabled() && connection == null) {
            logger.debug("No current connection; Returning default AmazonTemplate instance.");
        }
        return connection != null ? connection.getApi() : new AmazonTemplate();
    }
}