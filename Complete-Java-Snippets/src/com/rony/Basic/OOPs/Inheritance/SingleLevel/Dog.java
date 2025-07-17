package com.rony.Basic.OOPs.Inheritance.SingleLevel;

public class Dog extends Animal {
    public Dog(){
        super();
        System.out.println("Dog constructor called");
    }

    void eat(){
        super.eat(); //calls Animal eat also(overriding)
        System.out.println("Dog is eating too");
    }
    void bark(){
        System.out.println("Dog bark");
    }


}
