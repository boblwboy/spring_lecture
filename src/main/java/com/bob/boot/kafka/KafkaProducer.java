package com.bob.boot.kafka;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

/**
 * @author boblw
 * @title: KafkaProducer
 * @projectName spring_lecture
 * @description: TODO
 * @date 2019/12/19 8:42
 */
//@Component
public class KafkaProducer {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void sendKafkaMessage(KafkaMessage kafkaMessage) {
        this.kafkaTemplate.send("myTopic", new Gson().toJson(kafkaMessage));
    }

}
