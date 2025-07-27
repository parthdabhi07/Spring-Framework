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

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class YourBusinessClass {

    @Autowired
    Dependency1 dependency1; // now is instantiated by spring.
    // This is called Field dependency injection, Dependency is injected using reflection.
    // No setter OR constructor is required.

    Dependency2 dependency2;

    // Setter Injection
    @Autowired
    public void setDependency2(Dependency2 dependency2) {
        System.out.println("Setter Injection - set Dependency2");
        this.dependency2 = dependency2;
    }

    // Constructor Injection
//    @Autowired - Not mandatory to use @Autowired annotation on constructor.
//    public YourBusinessClass(Dependency1 dependency1, Dependency2 dependency2) {
//        super();
//        System.out.println("Constructor Injection - YourBusinessClass");
//        this.dependency1 = dependency1;
//        this.dependency2 = dependency2;
//    }

    @Override
    public String toString() {
        return "Using " + dependency1 + " and " + dependency2;
    }
}
