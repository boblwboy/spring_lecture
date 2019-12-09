package com.bob.boot.java8.time;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.TimeZone;

/**
 * @author boblw
 * @title: ZoneIdTest
 * @projectName spring_lecture
 * @description: TODO
 * @date 2019/12/9 16:20
 */
public class ZoneIdTest {
    public static void main(String[] args) {
        //地区ID都为"{区域}/{城市}"的格式，这些地区集合的设定都由英特网编号分配机构（IANA）的时区数据库提供。
        ZoneId romeZone = ZoneId.of("Europe/Rome");
        //你可以通过Java8的新方法toZoneId将一个老的时区对象转换为ZoneId：
        ZoneId zoneId = TimeZone.getDefault().toZoneId();

        //为时间点添加时区信息
        LocalDate date = LocalDate.of(2014, Month.MARCH, 18);
        ZonedDateTime zdt1 = date.atStartOfDay(romeZone);

        LocalDateTime dateTime = LocalDateTime.of(2014, Month.MARCH, 18, 13, 45, 01);

        ZonedDateTime zdt2 = dateTime.atZone(romeZone);
        //2014-03-18 13-45-01
        String formatDateTime = zdt2.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH-mm-ss"));
        System.out.println(formatDateTime);

        ZonedDateTime zdt3 = dateTime.atZone(zoneId);
        //2014-03-18 13-45-01
        String formatDateTime1 = zdt3.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH-mm-ss"));
        System.out.println(formatDateTime1);

        Instant instant = Instant.now();
        ZonedDateTime zdt4 = instant.atZone(romeZone);
        //2019-12-09 09-55-29
        String formatDateTime2 = zdt4.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH-mm-ss"));
        System.out.println(formatDateTime2);

        ZonedDateTime zdt5 = instant.atZone(zoneId);
        //2019-12-09 16-55-29
        String formatDateTime13 = zdt5.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH-mm-ss"));
        System.out.println(formatDateTime13);

        LocalDateTime localDateTime = LocalDateTime.of(2014, Month.MARCH, 18, 13, 45, 01);



    }
}
