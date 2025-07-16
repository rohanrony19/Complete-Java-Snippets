package com.rony.Basic.Interview;
//153 = 1^3 + 5^3 + 3^3
public class Armstrong {
    public static void main(String[] args) {
        int num = 9474;
        int original = num;
        int sum = 0;

        int digits = 0;
        int temp = num;
        while (temp != 0){
            digits++;
            temp = temp/10;
        }
        temp = num;

        while (temp != 0){
            int digit = temp % 10;
            sum +=  Math.pow(digit,digits);
            temp /= 10;
        }
        if (sum == original) {
            System.out.println(original + " is an Armstrong number");
        } else {
            System.out.println(original + " is NOT an Armstrong number");
        }
    }
}
