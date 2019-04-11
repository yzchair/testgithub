package com.common;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;


public class DataTest {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("请输入一个日期(yyyy-MM-dd) :");
        String str = br.readLine();

        int year = Integer.parseInt(str.substring(0, 4));
        int month = Integer.parseInt(str.substring(5, 7));
        int day = Integer.parseInt(str.substring(8, 10));

        LocalDate inputDate = LocalDate.of(year, month, day);
        inputDate = inputDate.plusDays(7);  // 日期加7天
        System.out.println("FormatStyle.MEDIUM格式输出这个日期:" +
                inputDate.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));

        System.out.println();

        //使用java8的日期时间包获取当前系统时间，并以各种格式加以显示
        LocalDateTime curDatetime = LocalDateTime.now();
        System.out.println("当前日期:" + curDatetime);
        System.out.println("短的日期格式:" + curDatetime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT, FormatStyle.SHORT)));
        System.out.println("中等的日期格式:" + curDatetime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM, FormatStyle.MEDIUM)));
        System.out.println("长的日期格式:" + curDatetime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG, FormatStyle.LONG)));
        System.out.println("完整的日期格式:" + curDatetime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));
        System.out.println("完整的日期时间格式:" + curDatetime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL, FormatStyle.LONG)));

        System.out.println();

        //使用java8的日期时间包获取当前系统时间，并修改这个时间（分别修改年份、月份、天、小时），然后打印结果
        System.out.println("修改年份为原来加4年:" + curDatetime.plusYears(4));
        System.out.println("修改月份为原来加1月:" + curDatetime.plusMonths(1));
        System.out.println("修改天数为原来加9天:" + curDatetime.plusDays(9));
        System.out.println("修改小时为原来加2小时:" + curDatetime.plusHours(2));
    }
}
