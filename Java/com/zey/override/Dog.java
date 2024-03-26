package com.zey.override;

public class Dog extends Animal{
    String name = "b";
    public static String i = "abc";
    public static void main(String[] args) {
        // Dog dog = new Dog();
        // dog.test();

        // Dog[] dogs = new Dog[5];
        // dogs[0] = dog;
        // dogs[1] = new Dog();

        Animal dog = new Dog("小狗");

        // System.out.println(dog instanceof Dog);

        System.out.println(dog.name);

        Dog dog2 = (Dog)dog;

        System.out.println(dog2.name);

        System.out.println(dog.getClass());

        System.out.println(dog2.i);
    }

    public void cry(){
        System.out.println("狗叫");
    }

    Dog(String name){
        super.name = name;
    }

}

/**
 * Animal
 */
class Animal {
    
    static int i = 0;

    String name = "a";

    Animal(){

    }
    
    public void cry(){
        System.out.println("动物叫");
    }

    public void test(){
        this.cry();
    }
}