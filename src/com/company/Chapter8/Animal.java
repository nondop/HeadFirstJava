package com.company.Chapter8;

public class Animal {
    public Animal(){
        System.out.println("Making animal...");
    }
    public void eat() {
        System.out.println("I'm eating");
    }

    public void eatAnimal(Animal animal) {
        animal.eat();
    }
}
