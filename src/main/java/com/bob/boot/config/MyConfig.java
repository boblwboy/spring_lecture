package com.bob.boot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author bob
 * @title: MyConfig
 * @projectName spring_lecture
 * @description: TODO
 * @date 2019/7/31 10:13 PM
 */
@Configuration
public class MyConfig {

    @Bean
    public MyConfigBean myConfigBean() {
        return new MyConfigBean();
    }
}
