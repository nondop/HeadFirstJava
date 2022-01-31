package com.company.Chapter8;

public class Cat extends Animal{
    public Cat(){
        super();
        System.out.println("Making a cat");
    }
    @Override
    public void eat() {
        System.out.println("Cat eating");
    }
}
