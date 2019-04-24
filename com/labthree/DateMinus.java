package com.labthree;

import java.time.*;
import java.util.Date;
import java.util.Calendar;

public class DateMinus {
    public static void main(String[] args) {
        // 日期前50天是哪一天，是星期几
        LocalDate curDate = LocalDate.now();
        System.out.println("今天是哪一天:" + curDate);

        LocalDate beforeDate = curDate.minusDays(50);

        // 转换LocalDate为Date
        ZoneId zone = ZoneId.systemDefault();
        Instant instant = beforeDate.atStartOfDay().atZone(zone).toInstant();
        Date date = Date.from(instant);

        String[] weeks = {"星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六"};
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int week_index = cal.get(Calendar.DAY_OF_WEEK) - 1;

        System.out.println("前50天是:" + beforeDate + "," + weeks[week_index]);

    }
}
