package com.hellospring.spring.lang.impl;

import com.hellospring.spring.lang.Language;

/**
 * Created by BK93287 on 2/7/2017.
 */
public class English implements Language {

    public String getGreeting() {
        return "Hello";
    }

    // Get a bye
    public String getBye() {
        return "Bye bye";
    }
}
