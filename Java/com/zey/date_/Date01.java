package com.zey.date_;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Date01 {
    
    public static void main(String[] args) {

        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd hh:mm:ss");
        String formatDate = dateFormat.format(date);
        System.out.println(formatDate);
    }

}
