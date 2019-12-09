package com.bob.boot.java8.time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;
import java.util.Locale;

/**
 * @author boblw
 * @title: DateTimeFormatterTest
 * @projectName spring_lecture
 * @description: DateTimeFormatterTest
 * @date 2019/12/9 15:29
 */
public class DateTimeFormatterTest {
    public static void main(String[] args) {

        LocalDate date = LocalDate.of(2014, 3, 18);

        //创建格式器最简单的方法是通过它的静态工厂方法以及常量。像BASIC_ISO_DATE和ISO_LOCAL_DATE这样的常量是DateTimeFormatter类的预定义实例。
        //20140318
        String s1 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println(s1);

        //2014-03-18
        String s2 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(s2);

        //可以通过解析代表日期或时间的字符串重新创建该日期对象。所有的日期和时间API都提供了表示时间点或者时间段的工厂方法，你可以使用工厂方法parse达到重创该日期对象的目的：
        LocalDate date1 = LocalDate.parse("20140318", DateTimeFormatter.BASIC_ISO_DATE);
        LocalDate date2 = LocalDate.parse("2014-03-18", DateTimeFormatter.ISO_LOCAL_DATE);

        //和老的java.util.DateFormat相比较，所有的DateTimeFormatter实例都是线程安全的。
        // 所以，你能够以单例模式创建格式器实例，就像DateTimeFormatter所定义的那些常量，并能在多个线程间共享这些实例。
        // DateTimeFormatter类还支持一个静态工厂方法，它可以按照某个特定的模式创建格式器。
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        //18/03/2014
        String formattedDate = date.format(dateTimeFormatter);
        System.out.println(formattedDate);

        LocalDate localDate = LocalDate.parse(formattedDate, dateTimeFormatter);

        //创建一个本地化的DateTimeFormatter
        DateTimeFormatter italianFormatter = DateTimeFormatter.ofPattern("d. MMMM yyyy", Locale.ITALIAN);
        //18. marzo 2014
        String italianFormatDate = date.format(italianFormatter);
        System.out.println(italianFormatDate);


        //更加细粒度的控制，DateTimeFormatterBuilder类还提供了更复杂的格式器，你可以选择恰当的方法，一步一步地构造自己的格式器。
        //另外，它还提供了非常强大的解析功能，比如区分大小写的解析、柔性解析（允许解析器使用启发式的机制去解析输入，不精确地匹配指定的模式）、填充，以及在格式器中指定可选节。
        DateTimeFormatter italianFormatter1 = new DateTimeFormatterBuilder().appendText(ChronoField.DAY_OF_MONTH)
                .appendLiteral(". ")
                .appendText(ChronoField.MONTH_OF_YEAR)
                .appendLiteral(" ")
                .appendText(ChronoField.YEAR)
                .parseCaseInsensitive().toFormatter(Locale.ITALIAN);
        //18. marzo 2014
        String italianFormatDate1 = date.format(italianFormatter1);
        System.out.println(italianFormatDate1);


    }
}
