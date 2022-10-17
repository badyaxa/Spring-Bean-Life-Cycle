package com.badyaxa.spring.beans;

import com.badyaxa.spring.interfaces.CustomBeanValidator;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class CustomBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName)
            throws BeansException {
        System.out.println("---- CustomBeanPostProcessor.postProcessBeforeInitialization()");
        return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName)
            throws BeansException {
        if (bean instanceof CustomBeanValidator) {
            System.out.println("---- CustomBeanPostProcessor.postProcessAfterInitialization()");

            System.out.println("---- " + beanName + " Validator(BEFORE)" + bean.toString());
            if (bean instanceof CustomBeanValidator) {
                ((CustomBeanValidator) bean).validate();
            }
            System.out.println("---- " + beanName + " Validator(AFTER)" + bean.toString());
        }
        return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }
}
