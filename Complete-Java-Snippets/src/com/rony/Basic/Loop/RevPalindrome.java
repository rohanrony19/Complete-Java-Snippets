package com.rony.Basic.Loop;

import java.util.Scanner;

public class RevPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers : ");
        int num = sc.nextInt();
        int original = num;
        int rev = 0;
        while(num != 0){

            rev = rev * 10 + num % 10;
            num = num / 10;
        }
        System.out.println("Reversed number : " + rev);
        System.out.println("Is palindrome? " + (original == rev));

    }
}
