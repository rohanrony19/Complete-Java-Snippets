package com.rony.Basic.Loop;

public class Repeat {
    public static void main(String[] args) {
        int num = 733578277;
        int digit = 7;
        int count = 0;
        while(num>0){
            int d = num % 10;
            if(d == digit){
                count++;
            }
            num = num/10;
        }
        System.out.println("Digit "+ digit + " appears " + count + " times");
    }
}
