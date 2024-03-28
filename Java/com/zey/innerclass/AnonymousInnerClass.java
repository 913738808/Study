package com.zey.innerclass;

/**
 * 匿名内部类
 */
public class AnonymousInnerClass {
    public static void main(String[] args) {

        OuterClass oClass = new OuterClass();
        
        oClass.method();

        oClass.method2();

        useAnonymousInnerClass(new IA() {
            @Override
            public void cry() {
                // TODO Auto-generated method stub
                System.out.println("匿名内部类实践");
            }
        });

        CellPhone cellPhone = new CellPhone();
        cellPhone.alarmClock(new Bell() {
            @Override
            public void ring() {
                // TODO Auto-generated method stub
                System.out.println("铃铃铃铃...");
            }
        });
    }

    public static void useAnonymousInnerClass(IA ia){

        ia.cry();

    }
}

// 外部类
class OuterClass{

    public void method(){

        /**
         * 需求：
         * 1. 实现IA接口 创建对象
         * 2. 传统方式 写一个类 实现接口 并创建对象
         * 3. 这个类只使用一次 后面不在使用
         * 4. 使用匿名内部类 简化开发
         * 5. tiger 的编译类型 IA
         * 6. tiger 的运行类型 为匿名内部类
         */

        /*
            底层
            class XXXX implemenets IA {
                @Override
                public void cry() {
                    // TODO Auto-generated method stub
                    System.out.println("老虎 叫 。。。");
                }
            }
            XXXX 为系统分配的类名
            外部类名 + $ + 1
            OuterClass$1

            匿名内部类 使用一次 不能再使用
        */
        IA tiger = new IA() {
            
            @Override
            public void cry() {
                // TODO Auto-generated method stub
                System.out.println("老虎 叫 。。。");
            }

        };

        tiger.cry();
        System.err.println(tiger.getClass());
    }

    public void method2(){
        /*
            基于类的匿名内部类
            编译类型 Father
            运行类型 OuterClass$2
        */

        Father son = new Father("Java"){
            
            public void printName(){
                System.out.println("我的名字" + this.name);
            }
            
        };

        son.printName();

        // 第二种调用方法的方式
        new Father("Python"){
            
            public void printName(){
                System.out.println("我的名字" + this.name);
            }
            
        }.printName();;
    }
}

/**
 * IA
 */
interface IA {

    public void cry();
    
}

abstract class Father {

    public String name = "";

    public Father(String name){
        this.name = name;
    }

    abstract public void printName();
}

/**
 * 练习
 */
class CellPhone {

    public void alarmClock(Bell bell){

        bell.ring();


    }

}

interface Bell {

    // 响铃方法
    public void ring();

}