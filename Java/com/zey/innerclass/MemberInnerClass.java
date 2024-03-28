package com.zey.innerclass;

/**
 * MemberInnerClass
 * 成员内部类
 */
public class MemberInnerClass {

    public static void main(String[] args) {
        
        // 外部其他类 访问 成员内部类 的 三种方式

        // 方法1 直接创建
        OuterClass1 outerClass1 = new OuterClass1();
        OuterClass1.InnerMemberInnerClass1 innerClass1 = outerClass1.new InnerMemberInnerClass1();
        innerClass1.output();

        // 方法2 在外部类中返回一个内部类实例
        OuterClass1.InnerMemberInnerClass1 innerClass12 = outerClass1.getInnerMemberClass();

        // 方式3
        OuterClass1.InnerMemberInnerClass1 innerClass13 = new OuterClass1().getInnerMemberClass();
    }

}

class OuterClass1 {

    public class InnerMemberInnerClass1 {
        
        public int n1 = 100;

        public void output(){
            System.out.println(n1);
        }
        
    }

    public InnerMemberInnerClass1 getInnerMemberClass(){

        return new InnerMemberInnerClass1();
    }

}