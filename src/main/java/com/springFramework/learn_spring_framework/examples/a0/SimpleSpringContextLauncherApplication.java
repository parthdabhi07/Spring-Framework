package com.springFramework.learn_spring_framework.examples.a0;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@ComponentScan("com.springFramework.learn_spring_framework.examples")
public class SimpleSpringContextLauncherApplication {

    public static void main(String[] args) {
        System.out.println("\nRadhaKrishan\n");

        var context
                = new AnnotationConfigApplicationContext
                    (SimpleSpringContextLauncherApplication.class);

        Arrays.stream(context.getBeanDefinitionNames())
                .forEach(System.out::println);

        context.close();
    }
}
