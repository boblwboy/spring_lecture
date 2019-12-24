package com.bob.boot.kafka;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * @author boblw
 * @title: KafkaConsumer
 * @projectName spring_lecture
 * @description: TODO
 * @date 2019/12/19 9:13
 */
//@Component
public class KafkaConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaConsumer.class);

    @KafkaListener(topics = "myTopic", groupId = "myGroup")
    public void obtainMessage(ConsumerRecord<String, String> consumerRecord) {
        LOGGER.info("obtainMessage invoked!");

        String topic = consumerRecord.topic();
        String key = consumerRecord.key();
        String value = consumerRecord.value();
        int partition = consumerRecord.partition();
        long timestamp = consumerRecord.timestamp();

        LOGGER.info("topic: " + topic);
        LOGGER.info("key: " + key);
        LOGGER.info("value: " + value);
        LOGGER.info("partition: " + partition);
        LOGGER.info("timestamp: " + timestamp);

        LOGGER.info("=======================");


    }

}
