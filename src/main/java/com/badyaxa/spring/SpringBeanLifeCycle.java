package com.badyaxa.spring;

import com.badyaxa.spring.config.BeansConfigManual;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringBeanLifeCycle {
    public static void main(String[] args) {

        System.out.println("================================ "
                + "MAIN -------before CONTEXT "
                + "=================================================");
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(BeansConfigManual.class);
        System.out.println("================================ "
                + "MAIN --------after CONTEXT "
                + "=================================================");

        System.out.println("-------------------------------- "
                + "BEFORE ============= FOREACH"
                + " ------------------------------------------------");
        for (String name : context.getBeanDefinitionNames()) {
            System.out.println("---- " + name + " -- context.getBean(name) = "
                    + context.getBean(name));
        }
        System.out.println("------------------------------- "
                + "AFTER =================== FOREACH"
                + " --------------------------------------------");

        context.close();
        System.out.println("---- context.close() invoked");
    }
}
