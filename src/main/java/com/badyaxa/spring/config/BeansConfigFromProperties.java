package com.badyaxa.spring.config;

import com.badyaxa.spring.beans.BeanClassB;
import com.badyaxa.spring.beans.BeanClassC;
import com.badyaxa.spring.beans.BeanClassD;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("application.properties")
public class BeansConfigFromProperties {

    @Value("${prefixBeanB.name}")
    private String nameFieldB;
    @Value("${prefixBeanB.value}")
    private int valueFieldB;

    @Value("${prefixBeanC.name}")
    private String nameFieldC;
    @Value("${prefixBeanC.value}")
    private int valueFieldC;

    @Value("${prefixBeanD.name}")
    private String nameFieldD;
    @Value("${prefixBeanD.value}")
    private int valueFieldD;

    @Bean(value = "beanB", initMethod = "customInitMethodB",
            destroyMethod = "customDestroyMethodB")
    @DependsOn(value = "beanD")
    public BeanClassB getBeanB() {
        return new BeanClassB(nameFieldB, valueFieldB);
    }

    @Bean(value = "beanC", initMethod = "customInitMethodC",
            destroyMethod = "customDestroyMethodC")
    @DependsOn(value = "beanB")
    public BeanClassC getBeanC() {
        return new BeanClassC(nameFieldC, valueFieldC);
    }

    @Bean(value = "beanD", initMethod = "customInitMethodD",
            destroyMethod = "customDestroyMethodD")
    public BeanClassD getBeanD() {
        return new BeanClassD(nameFieldD, valueFieldD);
    }
}
