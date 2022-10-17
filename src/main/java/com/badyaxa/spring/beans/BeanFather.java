package com.badyaxa.spring.beans;

import com.badyaxa.spring.interfaces.CustomBeanValidator;

public class BeanFather implements CustomBeanValidator {

    private String name;
    private int value;

    public BeanFather(String name, int value) {
        System.out.println("---- BeanFather.this.getClass().getSimpleName() = "
                + this.getClass().getSimpleName() + "(" + name + ", " + value + ")");
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "toString.BeanFather{"
                + "name='" + name + '\''
                + ", value=" + value
                + '}';
    }

    @Override
    public void validate() {
        if ((name.isEmpty()) && (name != null) && (value > 0)) {
            System.out.println("---- CustomBeanValidator >>>> valid");
        } else {
            System.out.println("---- CustomBeanValidator >>>> not valid");
        }
    }
}
