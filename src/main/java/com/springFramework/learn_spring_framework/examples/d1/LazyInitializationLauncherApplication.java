package com.springFramework.learn_spring_framework.examples.d1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class ClassA {


}

// By default, Spring beans are eagerly initialized. This means that Spring container initializes all beans at the time of context initialization.
// called "eager initialization" - recommended.
@Component
@Lazy
class ClassB {

    private ClassA classA;

    public ClassB (ClassA classA) {
        //1. Business Logic

        //2.
        System.out.println("\nSome Initialize logic");
        this.classA = classA;
    }

    public void doSomething() {
        System.out.println("Doing something");
    }
}

@Configuration
@ComponentScan
public class LazyInitializationLauncherApplication {

    public static void main(String[] args) {
        System.out.println("\nRadhaKrishan\n");

        var context
                = new AnnotationConfigApplicationContext(LazyInitializationLauncherApplication.class);

        System.out.println("Initialization of context is completed\n");

//        Arrays.stream(context.getBeanDefinitionNames())
//                .forEach(System.out::println);

        context.getBean(ClassB.class).doSomething();
    }
}
