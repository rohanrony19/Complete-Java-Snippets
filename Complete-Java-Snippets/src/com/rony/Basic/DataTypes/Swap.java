package com.rony.Basic.DataTypes;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number (a) :");
        int a = sc.nextInt();
        System.out.print("Enter first number (b) :");
        int b = sc.nextInt();
        int temp = a;
        a = b;
        b = temp;

        System.out.println("After Swapping");
        System.out.println("a = "+a);
        System.out.println("b = "+b);

    }
}
