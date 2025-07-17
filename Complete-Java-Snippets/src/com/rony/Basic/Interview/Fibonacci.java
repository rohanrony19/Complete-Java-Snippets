package com.rony.Basic.Interview;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of terms :");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        System.out.print("FIbonacci seried: " +a +" " + b+" ");
        for (int i = 3; i <= n; i++) {
            int c = a+b;
            System.out.print(c+" ");
            a = b;
            b = c;
        }

    }
}
