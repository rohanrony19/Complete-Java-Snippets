package com.rony.Basic.Loop;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numbers : ");
        int num = sc.nextInt();
        int original = num;
        int rev = 0;
        while(num>0){
            int digit = num % 10;
            rev = digit + rev*10;
            num = num/10;
        }
        if(rev==original){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
        
    }
}
