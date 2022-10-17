package com.badyaxa.spring.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanClassA extends BeanFather implements InitializingBean, DisposableBean {

    public BeanClassA(String name, int value) {
        super(name, value);
        System.out.println("---- BeanA.this.getClass().getSimpleName() = "
                + this.getClass().getSimpleName() + "(" + name + ", " + value + ")");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("---- START --A----------------- InitializingBean.afterPropertiesSet()");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("---- START --A----------------- DisposableBean.destroy()");
    }
}
