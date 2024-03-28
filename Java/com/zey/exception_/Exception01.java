package com.zey.exception_;

public class Exception01 {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 0;
        // java.lang.ArithmeticException 抛出异常
        try {
            int res = n1 / n2;
        } catch (ArithmeticException e) {
            // TODO: handle exception
            System.out.println("出现异常" + e.getMessage());
        }

        System.out.println("程序继续执行");
    }
}
