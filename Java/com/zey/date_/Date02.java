package com.zey.date_;

import java.util.Calendar;

public class Date02 {
    
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        System.out.println("年:" + calendar.get(Calendar.YEAR));

        System.out.println("时(12):" + calendar.get(Calendar.HOUR));
        System.out.println("时(24):" + calendar.get(Calendar.HOUR_OF_DAY));

        // Calendar 没有格式化方法
    }

}
