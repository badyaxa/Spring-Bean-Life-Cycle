package com.badyaxa.spring.config;

import com.badyaxa.spring.beans.BeanClassA;
import com.badyaxa.spring.beans.BeanClassE;
import com.badyaxa.spring.beans.BeanClassF;
import com.badyaxa.spring.beans.CustomBeanFactoryPostProcessor;
import com.badyaxa.spring.beans.CustomBeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Lazy;

@Configuration
@Import(BeansConfigFromProperties.class)
public class BeansConfigManual {

    @Bean("beanA")
    public BeanClassA getBeanA() {
        return new BeanClassA("nameFieldClasA", 1);
    }

    @Bean("beanE")
    public BeanClassE getBeanE() {
        return new BeanClassE("nameFieldClasE", 5);
    }

    @Bean("beanF")
    @Lazy
    public BeanClassF getBeanF() {
        return new BeanClassF("nameFieldClasF", 6);
    }

    @Bean("customBeanFactoryPostProcessor")
    public CustomBeanFactoryPostProcessor getCustomBeanFactoryPostProcessor() {
        return new CustomBeanFactoryPostProcessor();
    }

    @Bean("customBeanPostProcessor")
    public CustomBeanPostProcessor getCustomBeanPostProcessor() {
        return new CustomBeanPostProcessor();
    }
}
