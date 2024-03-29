package com.zey.wrapper;

public class WrapperType {
    public static void main(String[] args) {
        // int Integer 装箱与拆箱
        int n1 = 100;
        // 手动装箱
        Integer n2 = new Integer(n1);
        Integer n3 = Integer.valueOf(n1);
        // 手动拆箱
        int i = n3.intValue();

        // 自动装箱
        Integer n4 = n1;    // 底层使用的是 Integer.valueOf(n1)
        // 自动拆箱
        int n5 = n4;

        commonMethods();
    }

    public static void IntegerToString(){
        Integer i = 10;
        String s1 = i.toString();
        String s2 = String.valueOf(i);
        String s3 = i + "";

        String s4 = "123456";
        Integer i1 = Integer.parseInt(s4);
        Integer i2 = new Integer(s4);
    }

    public static void commonMethods(){

        System.out.println(Integer.MIN_VALUE);  // 返回最小值
        System.out.println(Integer.MAX_VALUE);  // 返回最大值

        System.out.println(Character.isDigit('a')); // 判断是否是数字
        System.out.println(Character.isLetter('a'));// 判断是否是字母
        System.out.println(Character.isUpperCase('a'));// 判断是否是大写字母
        System.out.println(Character.isLowerCase('a'));// 判断是否是小写字母
        System.out.println(Character.isWhitespace('a'));// 判断是否是空格
        System.out.println(Character.toUpperCase('a'));// 转换成大写
        System.out.println(Character.toLowerCase('A'));// 转换成小写

    }
}
