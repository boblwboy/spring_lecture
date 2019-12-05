package com.bob.boot.java8.time;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 * @author boblw
 * @title: DurationTest
 * @projectName spring_lecture
 * @description: TODO
 * @date 2019/12/5 11:19
 */
public class DurationTest {
    public static void main(String[] args) {
        System.out.println("=======================新的日期和时间API===============================");
        System.out.println("===========LocalDate、LocalTime、Instant、Duration以及Period==========");

        System.out.println("====================使用Instant、Duration以及Period=========================");

        System.out.println("====================定义Duration和Period=========================");

        LocalTime time1 = LocalTime.parse("11:27:01");
        LocalTime time2 = LocalTime.parse("11:27:02");

        Duration d1 = Duration.between(time1, time2);
        System.out.println(d1.getSeconds());

        LocalDateTime dateTime1 = LocalDateTime.parse("2019-12-05 13:37:04", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        LocalDateTime dateTime2 = LocalDateTime.parse("2019-12-04 13:37:04", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        Duration d2 = Duration.between(dateTime1,dateTime2);
        System.out.println(d2.getSeconds());

        Period period = Period.between(LocalDate.of(2019, 12, 5), LocalDate.of(2020, 1, 25));
        System.out.println(period.getMonths());

        //创建Duration Period对象
        Duration threeMinutes = Duration.ofMinutes(3);
        Duration threeMinutes1 = Duration.of(3, ChronoUnit.MINUTES);

        Period tenDays = Period.ofDays(10);
        Period threeWeeks = Period.ofWeeks(3);
        Period twoYearsSixMonthsOneDay = Period.of(2, 6, 1);


    }
}
