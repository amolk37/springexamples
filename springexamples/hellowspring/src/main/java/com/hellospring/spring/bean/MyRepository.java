package com.hellospring.spring.bean;

import org.springframework.stereotype.Repository;

import java.util.Date;

/**
 * Created by BK93287 on 2/7/2017.
 */
@Repository
public class MyRepository {

    public String getAppName() {
        return "Hello Spring App";
    }

    public Date getSystemDateTime() {
        return new Date();
    }
}
