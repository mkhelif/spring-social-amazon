package org.springframework.social.amazon.config.xml;

import org.springframework.beans.factory.xml.NamespaceHandler;
import org.springframework.social.config.xml.AbstractProviderConfigBeanDefinitionParser;
import org.springframework.social.config.xml.AbstractProviderConfigNamespaceHandler;

/**
 * {@link NamespaceHandler} for Spring Social Amazon.
 *
 * @author Marwan Khelif
 */
public class AmazonNamespaceHandler extends AbstractProviderConfigNamespaceHandler {

    /**
     * @see org.springframework.social.config.xml.AbstractProviderConfigNamespaceHandler#getProviderConfigBeanDefinitionParser()
     */
    @Override
    protected AbstractProviderConfigBeanDefinitionParser getProviderConfigBeanDefinitionParser() {
        return new AmazonConfigBeanDefinitionParser();
    }
}