package com.rony.Basic.OOPs;

public class Static {

    static String name = "Rony";//Static variable

    static void Demo(){    //Static method
        System.out.println("This is a Static method, Instance/Object cannot be created ");
    }


    static {
        System.out.println("Static block executed");
    }

    public static void main(String[] args) {
        Static.Demo();
        System.out.println(name);

    }
}
