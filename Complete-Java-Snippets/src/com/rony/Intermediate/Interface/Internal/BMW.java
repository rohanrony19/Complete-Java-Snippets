package com.rony.Intermediate.Interface.Internal;

public class BMW implements Car,Bike,Boat{

    @Override
    public void show() {
        System.out.println("BWM car method 1");
    }

    @Override
    public void config() {
        System.out.println("BMW car method 2");
    }

    @Override
    public void flow(){
        System.out.println("BMW boat");
    }

    @Override
    public void run(){
        System.out.println("BMW bike");
    }


}
