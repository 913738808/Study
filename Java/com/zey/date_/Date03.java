package com.zey.date_;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Date03 {
    
    public static void main(String[] args) {

        // 使用now() 返回当前日期时间的对象
        LocalDateTime ldt = LocalDateTime.now();

        System.out.println(ldt);

        System.out.println(ldt.getYear());
        System.out.println(ldt.getMonth());
        System.out.println(ldt.getMonthValue());

        DateTimeFormatter dFormatter = DateTimeFormatter.ofPattern("YYYY-MM-dd HH:mm:ss");
        DateTimeFormatter dFormatter2 = DateTimeFormatter.ofPattern("YYYY-MM-dd hh:mm:ss");

        String time = dFormatter.format(ldt);
        String time2 = dFormatter2.format(ldt);
        System.out.println(time);
        System.out.println(time2);

        Instant instant = Instant.now();
        System.out.println("instant" + instant);

        Date date = Date.from(instant);
        System.out.println("date" + date);

        Instant instant2 = date.toInstant();
        System.out.println("instant2" + instant2);


    }

}
