package com.hellospring.spring.lang.impl;

import com.hellospring.spring.lang.Language;

/**
 * Created by BK93287 on 2/7/2017.
 */
public class Vietnamese implements Language {
    public String getGreeting() {
        return "Xin Chao";
    }

    public String getBye() {
        return "Tam Biet";
    }
}
