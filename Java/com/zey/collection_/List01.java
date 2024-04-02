package com.zey.collection_;

import java.util.ArrayList;
import java.util.List;

public class List01 {
    public static void main(String[] args) {
        
        List list = new ArrayList<String>();
        list.add("藏剑");
        list.add("霸刀");

        List list_add = new ArrayList<String>();
        list_add.add("苍云");
        list_add.add("天策");

        list.addAll(1, list_add);

        System.out.println(list);
    }
}

