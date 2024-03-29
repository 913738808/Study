package com.zey.string_;

public class String01 {
    
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "acc";
        System.out.println(s1 == s2);

        String s3 = new String("abc");

        System.out.println(s2 == s3);
        // s3.intern()

        String s4 = s1 + s2;

    }
}
