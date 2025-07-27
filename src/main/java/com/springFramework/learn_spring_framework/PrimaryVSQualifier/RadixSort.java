package com.springFramework.learn_spring_framework.PrimaryVSQualifier;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component() @Primary
public class RadixSort implements SortingAlgorithm {
    public void hello() {
        System.out.println("Radhe Radhe - Radix Sort");
    }
}
