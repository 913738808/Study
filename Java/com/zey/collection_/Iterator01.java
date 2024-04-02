package com.zey.collection_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Iterator01 {
    public static void main(String[] args) {
        List list = new ArrayList<Book>();

        list.add(new Book("红楼梦", 80.00));
        list.add(new Book("三国", 20.00));
        list.add(new Book("水浒", 200.00));

        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Book book = (Book)iterator.next();
            System.out.println(book);
        }
        
        for (Object object : list) {
            Book book = (Book)object;
            System.out.println(book);
        }
    }
}

class Book{

    private String name;
    private double price;

    public Book(String name, double price){
        this.name = name;
        this.price = price;
    }

    public String toString(){

        return String.format("name: %s,price %f", this.name,this.price);
    }

}
