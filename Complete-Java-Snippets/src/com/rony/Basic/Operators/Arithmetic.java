package com.rony.Basic.Operators;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("enter second number: ");
        int num2 = sc.nextInt();
        System.out.println("Addition: "+(num1+num2));
        System.out.println("Subtraction: "+(num2-num1));
        System.out.println("Multiplication: "+(num1*num2));
        System.out.println("Quotient: "+(num2/num1));
        System.out.println("Remainder: "+(num2%num1));

    }
}
