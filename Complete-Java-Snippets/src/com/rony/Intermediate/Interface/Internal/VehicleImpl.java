package com.rony.Intermediate.Interface.Internal;

public class VehicleImpl implements Vehicle{
    public VehicleImpl(){
        System.out.println("No arg constructor");
    }
    @Override
    public void show(){
        System.out.println("in show");
    }
    @Override
    public void config(){
        System.out.println("in Config");
    }
}
