package com.bob.boot.java8.time;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

/**
 * @author boblw
 * @title: LocalDateTest
 * @projectName spring_lecture
 * @description: TODO
 * @date 2019/12/4 14:20
 */
public class LocalTimeTest {
    public static void main(String[] args) {
        System.out.println("=======================新的日期和时间API===============================");
        System.out.println("===========LocalDate、LocalTime、Instant、Duration以及Period==========");

        System.out.println("====================使用LocalDate和LocalTime=========================");
        LocalTime time = LocalTime.of(14, 56, 30);

        //14
        int hour = time.getHour();
        System.out.println(hour);

        //56
        int minute = time.getMinute();
        System.out.println(minute);

        //30
        int second = time.getSecond();
        System.out.println(second);

        //2019-12-04
        LocalDate date2 = LocalDate.parse("2019-12-04");
        System.out.println(date2);

        //14:56:30
        LocalTime time2 = LocalTime.parse("14:56:30");
        System.out.println(time2);

    }
}
