package com.bob.boot.java8.time;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

/**
 * @author boblw
 * @title: ManipulateDateTest
 * @projectName spring_lecture
 * @description: TODO
 * @date 2019/12/5 14:13
 */
public class ManipulateDateTest {

    public static void main(String[] args) {

        System.out.println("=======================新的日期和时间API===============================");
        System.out.println("===========LocalDate、LocalTime、Instant、Duration以及Period==========");

        System.out.println("====================操纵、解析、格式化日期=========================");
        //2014-03-18
        LocalDate date1 = LocalDate.of(2014, 3, 18);
        //2011-03-18
        LocalDate date2 = date1.withYear(2011);
        //2011-03-25
        LocalDate date3 = date2.withDayOfMonth(25);
        //2011-09-25
        LocalDate date4 = date3.with(ChronoField.MONTH_OF_YEAR, 9);
        //以相对方式修改LocalDate对象的属性
        //2014-03-18
        LocalDate localDate1 = LocalDate.of(2014, 3, 18);
        //2014-03-25
        LocalDate localDate2 = localDate1.plusWeeks(1);
        //2011-03-25
        LocalDate localDate3 = localDate2.minusYears(3);
        //2011-09-25
        LocalDate localDate4 = localDate3.plus(6, ChronoUnit.MONTHS);


    }

}
