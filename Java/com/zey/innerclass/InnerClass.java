package com.zey.innerclass;

/**
 * 
 * 内部类
 * 
 */
public class InnerClass {

    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.fn2();
    }
    
}

class Outer {

    private int n1 = 100;
    private int n2 = 200;
    
    private void fn1(){
        System.out.println("调用外部类方法 fn1");
    }

    public void fn2(){

        class InnerClass01 {
            
            private int n2 = 300;

            public void fn2(){
                System.out.println("内部类访问外部类变量:" + n1);

                fn1();

                // 成员重名 就近原则 直接访问 为300

                System.out.println(n2);

                // 通过类名.this.成员名

                System.out.println(Outer.this.n2);

            }
            
        }

        InnerClass01 innerClass01 = new InnerClass01();
        innerClass01.fn2();

    }

}

