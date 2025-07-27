package com.springFramework.learn_spring_framework.examples.c1;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Component
@Repository
public class MySqlDataService implements DataService {

    @Override
    public int[] retrieveData() {
        // Logic to connect to MySQL and retrieve data
        return new int[] { 1, 2, 3, 4, 5 };
    }
}
