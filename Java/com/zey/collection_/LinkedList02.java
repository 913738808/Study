package com.zey.collection_;

import java.util.LinkedList;

public class LinkedList02 {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        for (int i = 0; i < 3; i++) {
            linkedList.add(i);
        }
        linkedList.add(100);
        linkedList.add(100);

        System.out.println("linkedList = " + linkedList);

        /*
            源码阅读
            1. LinkedList linkedList = new LinkedList();
            调用了无参构造器
            public LinkedList() {
                this.size = 0;
            } 
            2. 此时 first = null last = null size = 0
            3. 执行了add方法
            
        */
    }
}
