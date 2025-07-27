//                                              "જય શ્રી ગણેશ"

/*
    Ques : Right now, we are using Java Configuration, now we do XML Configuration.

    XML = Extensible Markup Language : is a markup language that provides rules to define any data.
    -> It's a way to store and share data between computer systems.

    => Whatever we can do with Java Configuration, we can do with XML Configuration.
    => XML Configuration is more verbose than Java Configuration(Use Java Annotations)  - (not used now days).
*/

package com.springFramework.learn_spring_framework.examples.h1;

import com.springFramework.learn_spring_framework.game.GameRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

//@Configuration - Not need for XML Configuration
//@ComponentScan
public class XmlConfigurationContextLauncherApplication {

    public static void main(String[] args) {
        System.out.println("\nRadhaKrishna\n");

        // here, we are using Java Configuration to launch the application
//        var context
//                = new AnnotationConfigApplicationContext
//                    (XmlConfigurationContextLauncherApplication.class);

        // here, we are using XML Configuration to launch the application
        var context
                = new ClassPathXmlApplicationContext
                    ("contextConfiguration.xml");

        Arrays.stream(context.getBeanDefinitionNames())
                .forEach(System.out::println);

        System.out.println();

        System.out.println(context.getBean("name"));
        System.out.println(context.getBean("age"));
        // Run the game
        context.getBean(GameRunner.class).runGame();

        System.out.println("\nContext is close!");
        context.close();
    }
}
