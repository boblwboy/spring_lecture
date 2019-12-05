package com.bob.boot.java8.time;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author boblw
 * @title: InstantTest
 * @projectName spring_lecture
 * @description: TODO
 * @date 2019/12/5 11:24
 */
public class InstantTest {
    public static void main(String[] args) {
        System.out.println("=======================新的日期和时间API===============================");
        System.out.println("===========LocalDate、LocalTime、Instant、Duration以及Period==========");

        System.out.println("====================使用Instant、Duration以及Period=========================");

        System.out.println("====================机器的日期和时间格式=========================");
        Instant.ofEpochSecond(3);
        Instant.ofEpochSecond(3, 0);
        //2秒之后再加上100万纳秒(1秒)
        Instant.ofEpochSecond(2, 1_000_000_000);
        //4秒之前的100万纳秒(1秒)
        Instant.ofEpochSecond(4, 1_000_000_000);
        //获取当前时刻的时间戳
        System.out.println(Instant.now().getEpochSecond());
    }
}
