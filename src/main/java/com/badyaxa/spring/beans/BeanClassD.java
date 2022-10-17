package com.badyaxa.spring.beans;

public class BeanClassD extends BeanFather {

    public BeanClassD(String name, int value) {
        super(name, value);
        System.out.println("---- BeanD.this.getClass().getSimpleName() = "
                + this.getClass().getSimpleName() + "(" + name + ", " + value + ")");
    }

    public void customInitMethodD() {
        System.out.println("---- START -----------D-------- customInitMethodD()");
    }

    public void customDestroyMethodD() {
        System.out.println("---- START -----------D-------- customDestroyMethodD()");
    }
}
