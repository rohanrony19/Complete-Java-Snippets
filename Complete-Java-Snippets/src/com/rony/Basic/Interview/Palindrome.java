package com.rony.Basic.Interview;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int origin = n;
        int rev = 0;
        while (n>0){
            rev = rev *10 + n%10;
            n = n/10;
        }
        System.out.println(origin + (origin==rev?" is Palindrome":" is not Palindrome"));
    }
}
