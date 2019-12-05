package com.bob.boot.java8.time;

import java.time.*;
import java.time.format.DateTimeFormatter;

/**
 * @author boblw
 * @title: LocalDateTest
 * @projectName spring_lecture
 * @description: TODO
 * @date 2019/12/4 14:20
 */
public class LocalDateTimeTest {
    public static void main(String[] args) {
        System.out.println("=======================新的日期和时间API===============================");
        System.out.println("===========LocalDate、LocalTime、Instant、Duration以及Period==========");

        System.out.println("====================使用LocalDateTime=========================");

        LocalDateTime dt1 = LocalDateTime.of(2014, Month.MARCH, 18, 13, 45, 20);
        System.out.println(dt1.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));

        LocalDateTime dt2 = LocalDateTime.of(LocalDate.parse("2014-03-18"), LocalTime.parse("13:45:20"));
        System.out.println(dt2.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));

        LocalDate date = LocalDate.parse("2014-03-18");
        LocalDateTime dt3 = date.atTime(LocalTime.parse("13:45:20"));
        System.out.println(dt3.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));

        LocalDateTime dt4 = date.atTime(13, 45, 20);
        System.out.println(dt4.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));

        LocalTime time = LocalTime.of(13, 45, 20);
        LocalDateTime dt5 = time.atDate(date);
        System.out.println(dt5.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));

        LocalDateTime dateTime = LocalDateTime.parse("2019-12-04 14:56:30",DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        System.out.println(dateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));

        LocalDate date1 = dt1.toLocalDate();
        LocalTime time1 = dt1.toLocalTime();

    }
}
