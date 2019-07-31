package com.bob.boot.domain;

import java.util.Date;

/**
 * @author boblw
 * @title: Person
 * @projectName spring_lecture
 * @description: TODO
 * @date 2019/7/31 14:55
 */
public class Person {

    private int id;
    private String name;
    private Date birthday;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
