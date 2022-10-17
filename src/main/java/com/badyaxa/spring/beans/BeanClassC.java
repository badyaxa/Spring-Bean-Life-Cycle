package com.badyaxa.spring.beans;

public class BeanClassC extends BeanFather {

    public BeanClassC(String name, int value) {
        super(name, value);
        System.out.println("---- BeanC.this.getClass().getSimpleName() = "
                + this.getClass().getSimpleName() + "(" + name + ", " + value + ")");
    }

    public void customInitMethodC() {
        System.out.println("---- START --------C----------- "
                + "customInitMethodC()");
    }

    public void customDestroyMethodC() {
        System.out.println("---- START --------C----------- "
                + "customDestroyMethodC()");
    }
}
