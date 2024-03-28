package com.zey.designmodel;

public class TemplateModel {
    public static void main(String[] args) {
        AA aa = new AA();

        aa.caleTime();
    }
}

abstract class Template {

    public void caleTime(){

        long start = System.currentTimeMillis();
        
        this.job();
        
        long end = System.currentTimeMillis();

        System.out.println("job 的计算时间为" + ( end - start ));

    }

    public abstract void job();
}

class AA extends Template{

    @Override
    public void job() {
        // TODO Auto-generated method stub
        
        long sum = 0;
        for (int i = 0; i < 100000; i++) {
            sum += i;
        }

        System.out.println("AA 计算结果:" + sum);
    }

}