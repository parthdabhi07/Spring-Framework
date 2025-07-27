package com.springFramework.learn_spring_framework.PrimaryVSQualifier;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.springFramework.learn_spring_framework.PrimaryVSQualifier")
public class App {

    public static void main(String[] args) {

        System.out.println("\nRadhaKrishna\n");

        System.out.println("Primary vs Qualifier");

        var context
                = new AnnotationConfigApplicationContext(App.class);

        context.getBean(SortingAlgorithm.class).hello();

        context.close();
    }
}
