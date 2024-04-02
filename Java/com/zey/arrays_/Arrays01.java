package com.zey.arrays_;

import java.util.Arrays;
import java.util.Comparator;

public class Arrays01 {
    
    public static void main(String[] args) {
        // sort 排序
        // 1. 可以直接通过冒泡排序 也可以通过Arrays.sort排序
        // 2. 因为数组是引用数据类型 所以通过sort后会直接影响数组
        // 3. 也可以通过传入Comparator 实现定制排序
        Integer arr[] = { 1,-5,12,3,4,8 };
        
        // Arrays.sort(arr);

        Arrays.sort(arr, new Comparator<Integer>() {

            @Override
            public int compare(Integer i1, Integer i2) {
                // TODO Auto-generated method stub
                return -(i1 - i2);
            }
            
        });

        System.out.println(Arrays.toString(arr));

        Book[] books = new Book[5];
    
        books[0] = new Book("book1", 80);
        books[1] = new Book("book2", 50);
        books[2] = new Book("book3", 123);
        books[3] = new Book("book4", 100);
        books[4] = new Book("book5", 500);

        Arrays.sort(books,new Comparator<Book>() {

            @Override
            public int compare(Book o1, Book o2) {
                // TODO Auto-generated method stub
                return o2.price - o1.price;
            }
        });

        System.out.println(Arrays.toString(books));
    }   
}

class Book{
    
    String name = "";
    int price = 0;

    public Book(String name,int price){
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return String.format("{ name:%s,price:%d }", this.name,this.price);
    }

}
