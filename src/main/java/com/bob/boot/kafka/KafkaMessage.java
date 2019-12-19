package com.bob.boot.kafka;

import java.util.Date;

/**
 * @author boblw
 * @title: KafkaMessage
 * @projectName spring_lecture
 * @description: TODO
 * @date 2019/12/19 8:40
 */
public class KafkaMessage {
    private Long id;
    private String username;
    private String password;
    private Date date;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
