package com.example.packageDemo.service;

import com.example.packageDemo.model.HelloWorld;
import org.springframework.stereotype.Component;

@Component

public class BusinessService {
    public HelloWorld getHelloWorld() {
        return new HelloWorld();
    };
}
