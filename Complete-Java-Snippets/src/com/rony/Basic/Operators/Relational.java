package com.rony.Basic.Operators;

public class Relational {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        if(a>b){
            System.out.println(a + " is greater than "+b);
        }else if(b>a){
            System.out.println(b + " is greater than "+a);
        }else if(a==b){
            System.out.println("Both are equal" );
        }else{
            System.out.println("Not found");
        }
    }
}
