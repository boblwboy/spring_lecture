package com.bob.boot.controller;

import com.bob.boot.config.MyConfig;
import com.bob.boot.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author boblw
 * @title: MyController
 * @projectName spring_lecture
 * @description: TODO
 * @date 2019/7/31 14:55
 */
@RestController
@RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class MyController {

    @Value("${myConfig.myObject.myName}")
    private String myName;

    @Value("${myConfig.myObject.myAge}")
    private int myAge;

    @Autowired
    private MyConfig myConfig;

    @RequestMapping(value = "/person",method = RequestMethod.GET)
    public Person getPerson() {

        Person person = new Person();
        person.setId(25);
        person.setName("张三");
        person.setBirthday(new Date());

        System.out.println(myName);
        System.out.println(myAge);

        System.out.println("==================");

        System.out.println(myConfig.myConfigBean().getMyName());
        System.out.println(myConfig.myConfigBean().getMyAge());

        return person;
    }

}
