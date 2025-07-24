package com.rony.Intermediate.Wrapper;

public class StringToInteger {
    public static void main(String[] args) {
        String s1 = "20";
        String s2 = "30";

        int num1 = Integer.parseInt(s1);
        int num2 = Integer.parseInt(s2);

        int sum = num1 + num2;
        System.out.println("Sum: " + sum);
    }
}
