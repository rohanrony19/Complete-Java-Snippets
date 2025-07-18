package com.rony.Basic.OOPs;

public class NonStatic {
    public void show(){
        System.out.println("This is Non Static method, object can be created");
    }

    public static void main(String[] args) {
        NonStatic nonStatic = new NonStatic();
        nonStatic.show();
    }
}
