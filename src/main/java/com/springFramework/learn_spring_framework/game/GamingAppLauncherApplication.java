//                                              "જય શ્રી ગણેશ"

/*
    Ques : Here we do not used @Bean, Here Spring is managing the object, Autowiring the object also creating the object.
*/

package com.springFramework.learn_spring_framework.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.springFramework.learn_spring_framework.game")
public class GamingAppLauncherApplication {

    public static void main(String[] args) {
        System.out.println("\nRadhaKrishna\n");

        var context
                = new AnnotationConfigApplicationContext(GamingAppLauncherApplication.class);

        // Spring is managing the object, Autowiring the object also creating the object
        context.getBean(GameRunner.class).runGame();

        context.close();
    }
}
