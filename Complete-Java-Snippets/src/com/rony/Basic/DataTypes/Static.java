package com.rony.Basic.DataTypes;

public class Static {
    public static void main(String[] args) {
        Static.age = 10;
        System.out.println(age);
        Static.method();
        
    }
    static int age;

    public Static(int age){
        this.age = age;
    }

    static void method(){
        System.out.println("method");
    }


}

