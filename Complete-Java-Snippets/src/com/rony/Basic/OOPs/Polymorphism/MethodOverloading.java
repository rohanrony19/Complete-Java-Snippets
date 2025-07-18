package com.rony.Basic.OOPs.Polymorphism;

public class MethodOverloading {
    public void load(int a,int b){
        System.out.println(a+" "+ b);
    }
    public void load(int a,int b,int c){
        System.out.println(a+" " + b+ " "+ c );
    }

    public static void main(String[] args) {
        MethodOverloading methodOverloading = new MethodOverloading();
        methodOverloading.load(20,26);
        methodOverloading.load(1,4,3);
    }
}
