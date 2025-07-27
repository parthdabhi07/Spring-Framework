package com.springFramework.learn_spring_framework.examples.c1;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Component
@Repository // This is a repository class - Data Service, Both work same
@Primary
public class MongoDBDataService implements DataService {

    @Override
    public int[] retrieveData() {
        // Logic to connect to MongoDB and retrieve data
        return new int[] { 11, 22, 33, 44, 55 };
    }
}
