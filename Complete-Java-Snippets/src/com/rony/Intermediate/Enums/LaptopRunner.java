package com.rony.Intermediate.Enums;

public class LaptopRunner {
    public static void main(String[] args) {
        for(Laptop laptop : Laptop.values()){
            System.out.println(laptop + " : " + laptop.getPrice());
        }
    }
}
