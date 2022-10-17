package com.badyaxa.spring.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class CustomBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory)
            throws BeansException {
        System.out.println("---- CustomBeanFactoryPostProcessor.postProcessBeanFactory(BEFORE)"
                + configurableListableBeanFactory.getBeanDefinition("beanB").getInitMethodName());
        configurableListableBeanFactory.getBeanDefinition("beanB")
                .setInitMethodName("initMethodChangedInCustomBeanFactoryPostProcessorClass");
        System.out.println("---- CustomBeanFactoryPostProcessor.postProcessBeanFactory(AFTER)"
                + configurableListableBeanFactory.getBeanDefinition("beanB").getInitMethodName());
    }
}
