package com.zey.abstracts;

public class Abstract01 {
    
    public static void main(String[] args) {
        
        Animal cat = new Cat("小猫");

        cat.eat();
    }

}

abstract class Animal {

    private String name;

    public Animal(String name){
        this.name = name;
    }

    public abstract void eat();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Cat extends Animal{


    public Cat(String name){
        super(name);
    }

    @Override
    public void eat() {
        // TODO Auto-generated method stub
        System.out.println(this.getName() + " 吃 " + "....");
    }
}