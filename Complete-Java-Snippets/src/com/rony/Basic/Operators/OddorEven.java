package com.rony.Basic.Operators;

public class OddorEven {
    public static void main(String[] args) {
        int a = 77;
        if(a % 2 == 0){
            System.out.println(a + " is even");
        }else{
            System.out.println(a + " is odd");
        }
        String num = a % 2==0 ?"Even":"Odd";
        System.out.println(num);
    }
}
