package com.springFramework.learn_spring_framework.examples.c1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Arrays;

//@Component
@Service // This is a service class - Business Service
// By,using specific annotation, we are giving more information to the Spring Framework about your intention.
public class BusinessCalculationService {

    private DataService dataService;

    @Autowired
    public BusinessCalculationService (@Qualifier("mySqlDataService") DataService dataService) {
        this.dataService = dataService;
    }

    public int findMax() {
        return Arrays.stream(dataService.retrieveData()).max().orElse(0);
    }
}
