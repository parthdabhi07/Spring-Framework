//                                              "જય શ્રી ગણેશ"

/*
    Ques : In this example, we are focusing on Business logic only, instead of focusing on how to create object,
              how to manage object, Wiring object, etc.
*/

package com.springFramework.learn_spring_framework.examples.c1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@ComponentScan
public class ApplicationSpringContext {

    public static void main(String[] args) {
        System.out.println("\nRadhaKrishna\n");

        var context
                = new AnnotationConfigApplicationContext
                    (ApplicationSpringContext.class);

        Arrays.stream(context.getBeanDefinitionNames())
                .forEach(System.out::println);

        System.out.println(
                context.getBean(BusinessCalculationService.class)
                        .findMax()
        );
    }
}
