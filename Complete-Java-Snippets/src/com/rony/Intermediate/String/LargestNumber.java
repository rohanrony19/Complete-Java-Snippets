package com.rony.Intermediate.String;

public class LargestNumber {
    public static void main(String[] args) {
        int a = 10;
        int b = 25;
        int c = 7;
        if(a > b && a > c){
            System.out.println(a + "is largest");
        } else if (b > a && b > c) {
            System.out.println(b);
        }else {
            System.out.println(c);
        }

        int largest = (a > b) ? (a > c ? a: c): (b > c ? b : c);
        System.out.println("Largest: " +largest);
    }
}
