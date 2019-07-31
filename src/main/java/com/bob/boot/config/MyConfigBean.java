package com.bob.boot.config;

import org.springframework.beans.factory.annotation.Value;

/**
 * @author bob
 * @title: MyConfigBean
 * @projectName spring_lecture
 * @description: TODO
 * @date 2019/7/31 10:07 PM
 */
public class MyConfigBean {


    @Value("${myConfig.myObject.myName}")
    private String myName;

    @Value("${myConfig.myObject.myAge}")
    private int myAge;

    public String getMyName() {
        return myName;
    }

    public void setMyName(String myName) {
        this.myName = myName;
    }

    public int getMyAge() {
        return myAge;
    }

    public void setMyAge(int myAge) {
        this.myAge = myAge;
    }
}
