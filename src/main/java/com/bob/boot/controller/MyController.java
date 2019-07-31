package com.bob.boot.controller;

import com.bob.boot.domain.Person;
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

    @RequestMapping(value = "/person",method = RequestMethod.GET)
    public Person getPerson() {

        Person person = new Person();
        person.setId(25);
        person.setName("张三");
        person.setBirthday(new Date());

        return person;
    }

}
