package com.rony.Basic.Conditonal;

public class Elseif {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 66;
        int num3 = 18;
        if(num1 > num2 && num1 > num3){
            System.out.println(num1 + " is greater");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println(num2 + " is greater");
        }else{
            System.out.println(num3 + " is greater");
        }
    }
}
