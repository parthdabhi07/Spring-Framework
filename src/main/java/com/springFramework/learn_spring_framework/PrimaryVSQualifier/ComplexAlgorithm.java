package com.springFramework.learn_spring_framework.PrimaryVSQualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ComplexAlgorithm {

    @Autowired
    private SortingAlgorithm sortingAlgorithm;
}
