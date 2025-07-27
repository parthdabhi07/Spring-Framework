package com.springFramework.learn_spring_framework.PrimaryVSQualifier;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class QuickSort implements SortingAlgorithm{

    public void hello() {
        System.out.println("Radhe Rahde - Quick Sort");
    }
}
