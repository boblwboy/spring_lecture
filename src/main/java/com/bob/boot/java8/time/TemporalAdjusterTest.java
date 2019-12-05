package com.bob.boot.java8.time;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

/**
 * @author boblw
 * @title: TemporalAdjusterTest
 * @projectName spring_lecture
 * @description: TODO
 * @date 2019/12/5 14:39
 */
public class TemporalAdjusterTest {
    public static void main(String[] args) {

        //2014-03-18
        LocalDate date1 = LocalDate.of(2014, 3, 18);
        //创建一个新的日期，并将其值设定为日期调整后或者调整前，第一个符合指定星期几要求的日期，如果该日期已经符合要求，直接返回该对象
        //2014-03-23
        LocalDate date2 = date1.with(TemporalAdjusters.nextOrSame(DayOfWeek.SATURDAY));
        //2014-03-31
        LocalDate date3 = date2.with(TemporalAdjusters.lastDayOfMonth());

        //定制的TemporalAdjuster
        //能够计算明天的日期，同时过滤掉周六和周日这些节假日。
        LocalDate date4 = date3.with(temporal -> {
            DayOfWeek dow = DayOfWeek.of(temporal.get(ChronoField.DAY_OF_WEEK));
            int dayToAdd = 1;
            if (dow == DayOfWeek.FRIDAY) {
                dayToAdd = 3;
            } else if (dow == DayOfWeek.SATURDAY) {
                dayToAdd = 2;
            }

            return temporal.plus(dayToAdd, ChronoUnit.DAYS);
        });

        System.out.println(date4.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));

    }
}
