package com.xworkz.access;

public class AccessSpeci {
    public static void main(String[] args){
//        int v=90;
        Variable var= new Variable(90);

        var.height=56;
        var.eat();
        System.out.println(var.age);


    }
}
