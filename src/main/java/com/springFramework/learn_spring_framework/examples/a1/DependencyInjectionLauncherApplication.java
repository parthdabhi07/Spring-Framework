//                                              "જય શ્રી ગણેશ"

/*
    Ques : What is Dependency Injection?
    Ans : Dependency Injection is a technique in which an object receives other objects that it depends on.
          These other objects are called dependencies. In Spring, Dependency Injection is done using
          Inversion of Control (IoC) design pattern.

           There are 3 types of Dependency Injection:
           1. Constructor Injection (Preferred) By default, Spring uses Constructor Injection.
           2. Setter Injection
           3. Field Injection
*/

package com.springFramework.learn_spring_framework.examples.a1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Configuration
@ComponentScan("com.springFramework.learn_spring_framework.examples.a1")
public class DependencyInjectionLauncherApplication {

    public static void main(String[] args) {
        System.out.println("\nRadhaKrishan\n");

        var context
                = new AnnotationConfigApplicationContext
                    (DependencyInjectionLauncherApplication.class);

        Arrays.stream(context.getBeanDefinitionNames())
                .forEach(System.out::println);

        System.out.println(context.getBean(YourBusinessClass.class));

        context.close();
    }
}
