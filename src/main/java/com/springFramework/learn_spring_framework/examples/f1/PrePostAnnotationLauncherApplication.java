//                                              "જય શ્રી ગણેશ"

/*
    @PostConstruct and @PreDestroy annotations are used to execute some logic after bean is created and before bean is destroyed respectively.

    1. @PostConstruct : This annotation is used on a method that needs to be executed
        after dependency injection is done to perform any initialization.
*/

package com.springFramework.learn_spring_framework.examples.f1;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
class SomeClass {

    private SomeDependency someDependency;

    public SomeClass(SomeDependency someDependency) {
        this.someDependency = someDependency;
        System.out.println("All dependencies are injected(ready)");
    }

    @PostConstruct
    public void intialize() {
        someDependency.getReady();
    }

    @PreDestroy
    public void cleanUp() {
        System.out.println("Clean up logic");
    }
}

@Component
class SomeDependency {

    public void getReady() {
        System.out.println("Some logic using SomeDependency");
    }
}

@Configuration
@ComponentScan
public class PrePostAnnotationLauncherApplication {

    public static void main(String[] args) {
        System.out.println("\nRadhaKrishna\n");

        var context
                = new AnnotationConfigApplicationContext
                    (PrePostAnnotationLauncherApplication.class);

        System.out.println(context.getBean(SomeClass.class));

        context.close();
    }
}
