package com.hellospring.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by BK93287 on 2/7/2017.
 */
@Component
public class MyComponent {

    @Autowired
    private MyRepository repository;

    public void showAppInfo() {
        System.out.println("Now is: "+ repository.getSystemDateTime());
        System.out.println("App Name: "+ repository.getAppName());
    }
}
