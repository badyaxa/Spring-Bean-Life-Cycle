package com.badyaxa.spring.beans;

public class BeanClassF extends BeanFather {

    public BeanClassF(String name, int value) {
        super(name, value);
        System.out.println("---- BeanF.this.getClass().getSimpleName() = "
                + this.getClass().getSimpleName() + "(" + name + ", " + value + ")");
    }
}
