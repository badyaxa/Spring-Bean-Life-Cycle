package com.badyaxa.spring.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class BeanClassE extends BeanFather {
    public BeanClassE(String name, int value) {
        super(name, value);
        System.out.println("---- BeanE.this.getClass().getSimpleName() = "
                + this.getClass().getSimpleName() + "(" + name + ", " + value + ")");
    }

    @PostConstruct
    public void customPostConstruct() {
        System.out.println("---- START --------------E----- @PostConstruct.customPostConstruct()");
    }

    @PreDestroy
    public void customPreDestroy() {
        System.out.println("---- START --------------E----- @PreDestroy.customPreDestroy()");
    }
}
