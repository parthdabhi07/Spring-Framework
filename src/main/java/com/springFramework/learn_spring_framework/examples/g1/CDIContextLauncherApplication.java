package com.springFramework.learn_spring_framework.examples.g1;

import jakarta.inject.Inject;
import jakarta.inject.Named;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

//@Component
//@Named //(Replacement of @Component)
class BusinessService {

    private DataService dataService;

  @Autowired
//    @Inject (Replacement of @Autowired)
    public void setDataService(DataService dataService) {
        System.out.println("Setter Injection");
        this.dataService = dataService;
    }

    public DataService getDataService() {
        return dataService;
    }
}

@Component
class DataService {

}

@Configuration
@ComponentScan
public class CDIContextLauncherApplication {

    public static void main(String[] args) {
        System.out.println("\nRadhaKrishna\n");

        var context
                = new AnnotationConfigApplicationContext
                    (CDIContextLauncherApplication.class);

        Arrays.stream(context.getBeanDefinitionNames())
                .forEach(System.out::println);

        System.out.println(context.getBean(BusinessService.class).getDataService());

        context.close();
    }
}
