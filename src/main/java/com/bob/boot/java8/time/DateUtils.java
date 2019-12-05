package com.bob.boot.java8.time;

/**
 * @author boblw
 * @title: DateUtils
 * @projectName spring_lecture
 * @description: TODO
 * @date 2019/12/5 16:43
 */
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class DateUtils {

    public static Date asDate(LocalDate localDate) {
        return Date.from(localDate.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());
    }

    public static Date asDate(LocalDateTime localDateTime) {
        return Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());
    }

    public static LocalDate asLocalDate(Date date) {
        return Instant.ofEpochMilli(date.getTime()).atZone(ZoneId.systemDefault()).toLocalDate();
    }

    public static LocalDateTime asLocalDateTime(Date date) {
        return Instant.ofEpochMilli(date.getTime()).atZone(ZoneId.systemDefault()).toLocalDateTime();
    }

    public static void main(String[] args)
    {
        Date date = DateUtils.asDate(LocalDateTime.now());
        //Sun Jul 15 12:08:44 IST 2018
        System.out.println(date);
        LocalDateTime today = DateUtils.asLocalDateTime(new Date());
        //2018-07-15T12:08:44.492
        System.out.println(today);
    }
}