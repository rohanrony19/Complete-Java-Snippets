package com.rony.Basic.Conditonal;

import java.util.Scanner;

public class Else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        if(n <= 100){
            if(n <= 100 && n >= 90){
                System.out.println("A+ Grade");
            } else if (n < 90 && n >= 80 ) {
                System.out.println("A Grade");
            }else if(n < 80 && n >= 70 ){
                System.out.println("B Grade");
            } else if (n < 70 && n >=60) {
                System.out.println("C Grade");
            }else if(n<60){
                System.out.println("Fail");
            }
        }

    }
}
