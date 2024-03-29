package com.zey.string_;

public class StringBuffer01 {
    

    // 创建一个 大小为  16 的 char[] 用于存放字符内容
    StringBuffer stringBuffer = new StringBuffer();
    // 通过构造器 指定创建 大小为 100 的char[]
    StringBuffer stringBuffer2 = new StringBuffer(100);
    // 通过给一个 String 创建 StringBuffer char[] 大小 为字符串长度 加 16
    StringBuffer stringBuffer3 = new StringBuffer("Hello world!");

    public static void main(String[] args) {
        
        // String 转 StringBuffer
        String s = "hello";
        // 1
        StringBuffer b1 = new StringBuffer(s);
        // 2
        StringBuffer b2 = new StringBuffer();
        b2.append(s);

        // StringBuffer 转 String
        String s1 = b1.toString();
        String s2 = new String(b1);
    }
    
}
