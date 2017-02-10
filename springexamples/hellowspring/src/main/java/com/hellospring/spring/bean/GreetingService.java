package com.hellospring.spring.bean;

import com.hellospring.spring.lang.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by BK93287 on 2/7/2017.
 */
@Service
public class GreetingService {

    @Autowired
    private Language language;

    public GreetingService() {

    }

    public void sayGreeting() {

        String greeting = language.getGreeting();

        System.out.println("Greeting: " + greeting);
    }
}
