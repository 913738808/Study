package com.zey.interfaces;

public class Interfalce01 {



}

// 如果一个类 implements 实现 接口
// 需要将该接口的所有 abstract 方法实现
class A implements AInterface {

    @Override
    public void hi() {
        // TODO Auto-generated method stub
        System.out.println("hi...");
    }

}

interface AInterface{

    // 属性
    public int num = 10;
    
    // 方法
    public void hi();
    
    // 默认实现方法 需要用 default 关键字
    public default void ok(){
        System.out.println("ok...");
    }

    // 静态方法
    public static void haha(){
        System.out.println("haha...");
    }
}