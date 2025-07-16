package com.rony.Basic.OOPs.Inheritance.Multilevel;

public class Car extends Vehicle {
    public Car(){
        System.out.println("Car constructor");
    }
    void drive(){
        super.drive();
        System.out.println("Car drives");
    }
}
