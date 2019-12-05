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
public class LocalDateTest {
    public static void main(String[] args) {
        System.out.println("=======================新的日期和时间API===============================");
        System.out.println("===========LocalDate、LocalTime、Instant、Duration以及Period==========");

        System.out.println("====================使用LocalDate和LocalTime=========================");
        LocalDate date = LocalDate.of(2019, 12, 4);
        System.out.println(date);

        int year = date.getYear();
        System.out.println(year);

        Month month = date.getMonth();
        System.out.println(month);

        int day = date.getDayOfMonth();
        System.out.println(day);

        DayOfWeek dayOfWeek = date.getDayOfWeek();
        System.out.println(dayOfWeek);

        int len = date.lengthOfMonth();
        System.out.println(len);

        boolean leap = date.isLeapYear();
        System.out.println(leap);

        LocalDate today = LocalDate.now();

        int year1 = today.get(ChronoField.YEAR);
        System.out.println(year1);

        int month1 = today.get(ChronoField.MONTH_OF_YEAR);
        System.out.println(month1);

        int day1 = today.get(ChronoField.DAY_OF_MONTH);
        System.out.println(day1);

    }
}