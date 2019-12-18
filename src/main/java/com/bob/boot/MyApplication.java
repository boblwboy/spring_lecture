package com.bob.boot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

/**
 * @author boblw
 * @title: MyApplication
 * @projectName spring_lecture
 * @description: TODO
 * @date 2019/7/31 14:53
 */
@SpringBootApplication
public class MyApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(MyApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(MyApplication.class, args);
    }

    @PostConstruct
    public void myLog() {
        LOGGER.trace("Trace Message");
        LOGGER.debug("Debug Message");
        LOGGER.info("Info Message");
        LOGGER.warn("Warn Message");
        LOGGER.error("Error Message");
    }
}
