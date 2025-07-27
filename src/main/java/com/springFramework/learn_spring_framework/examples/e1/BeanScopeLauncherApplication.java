//                                              "જય શ્રી ગણેશ"

/*
    Ques : Spring Bean Scopes

    => Spring Bean are defined to be used in specific scopes.
    Types :
        1. Singleton : One object instance per Spring IoC container - "Default"
                       The same object is returned each time it is requested.
        2. Prototype : Possibly many object instances per Spring IoC container
                       Each time a new object is requested, a new instance is created.

    => Other Scopes : These are only applicable in web-aware Spring Application Context web applications.
        3. Request : One object instance per single HTTP request
        4. Session : One object instance per user HTTP session
        5. Global Session : One object instance per global HTTP session
        6. Application : One object instance per ServletContext
        7. WebSocket : One object instance per WebSocket

    => Java Singleton(GOF) Vs Spring Singleton
        Java Singleton : One object instance per JVM
        Spring Singleton : One object instance per Spring IoC container
*/

package com.springFramework.learn_spring_framework.examples.e1;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
class NormalClass {

}

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
class PrototypeClass {

}

@Configuration
@ComponentScan
public class BeanScopeLauncherApplication {

    public static void main(String[] args) {
        System.out.println("\nRadhaKrishna\n");

        var context
                = new AnnotationConfigApplicationContext
                    (BeanScopeLauncherApplication.class);

        System.out.println(context.getBean(NormalClass.class));
        System.out.println(context.getBean(NormalClass.class));
        System.out.println(context.getBean(NormalClass.class));
        System.out.println(context.getBean(NormalClass.class));

        System.out.println();

        System.out.println(context.getBean(PrototypeClass.class));
        System.out.println(context.getBean(PrototypeClass.class));
        System.out.println(context.getBean(PrototypeClass.class));
        System.out.println(context.getBean(PrototypeClass.class));
    }
}
