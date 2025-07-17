package com.rony.Basic.OOPs.Inheritance.Multilevel;

public class Dodge extends Car {
    public Dodge(){
        System.out.println("Dodge Constructor");
    }

    void drive(){
        super.drive();
        System.out.println("Dodge drive");
    }
}
