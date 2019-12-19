package com.bob.boot.controller;

import com.bob.boot.config.MyConfig;
import com.bob.boot.domain.Person;
import com.bob.boot.kafka.KafkaConsumer;
import com.bob.boot.kafka.KafkaMessage;
import com.bob.boot.kafka.KafkaProducer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author boblw
 * @title: KafkaController
 * @projectName spring_lecture
 * @description: TODO
 * @date 2019/12/19 09:30
 */
@RestController
@RequestMapping(value = "/kafka", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class KafkaController {

    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaController.class);

    @Autowired
    private KafkaProducer kafkaProducer;

    @RequestMapping(value = "/message",method = RequestMethod.GET)
    public KafkaMessage sendKafkaMessage(@RequestParam(name = "id") long id,
                                         @RequestParam(name = "username") String username,
                                         @RequestParam(name = "password") String password) {

        LOGGER.info("sendKafkaMessage invoked");

        KafkaMessage kafkaMessage = new KafkaMessage();
        kafkaMessage.setId(id);
        kafkaMessage.setUsername(username);
        kafkaMessage.setPassword(password);
        kafkaMessage.setDate(new Date());

        this.kafkaProducer.sendKafkaMessage(kafkaMessage);

        return kafkaMessage;
    }

}
