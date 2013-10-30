package org.springframework.social.amazon.config.xml;

import java.util.Map;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.social.amazon.config.support.AmazonApiHelper;
import org.springframework.social.amazon.connect.AmazonConnectionFactory;
import org.springframework.social.amazon.security.AmazonAuthenticationService;
import org.springframework.social.config.xml.AbstractProviderConfigBeanDefinitionParser;
import org.springframework.social.security.provider.SocialAuthenticationService;

/**
 * Implementation of {@link AbstractConnectionFactoryBeanDefinitionParser} that creates a {@link AmazonConnectionFactory}.
 *
 * @author Marwan Khelif
 */
class AmazonConfigBeanDefinitionParser extends AbstractProviderConfigBeanDefinitionParser {

    public AmazonConfigBeanDefinitionParser() {
        super(AmazonConnectionFactory.class, AmazonApiHelper.class);
    }

    /**
     * @see org.springframework.social.config.support.ProviderConfigurationSupport#getAuthenticationServiceClass()
     */
    @Override
    protected Class<? extends SocialAuthenticationService<?>> getAuthenticationServiceClass() {
        return AmazonAuthenticationService.class;
    }
    
    /**
     * @see org.springframework.social.config.support.ProviderConfigurationSupport#getConnectionFactoryBeanDefinition(java.lang.String, java.lang.String, java.util.Map)
     */
    @Override
    protected BeanDefinition getConnectionFactoryBeanDefinition(String appId, String appSecret, Map<String, Object> allAttributes) {
        BeanDefinitionBuilder builder = BeanDefinitionBuilder.genericBeanDefinition(AmazonConnectionFactory.class).addConstructorArgValue(appId).addConstructorArgValue(appSecret);
        return builder.getBeanDefinition();
    }
}