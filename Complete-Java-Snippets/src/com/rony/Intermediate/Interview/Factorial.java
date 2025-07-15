package com.rony.Intermediate.Interview;

import java.util.Scanner;
// 5 = 5*4*3*2*1 = 120
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        long fact = 1;
        for (int i = 1; i <= n ; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of " + n + " is: " + fact);
    }
}
