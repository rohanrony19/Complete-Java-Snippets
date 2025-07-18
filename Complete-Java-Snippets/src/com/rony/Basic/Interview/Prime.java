package com.rony.Basic.Interview;
// Divisible by 1 and itself
public class Prime {
    public static void main(String[] args) {
        int num = 23;
        boolean isPrime = true;
        if(num<=1){
            isPrime = false;
        }else {
            for (int i = 2; i <= num /2 ; i++) {
                if (num%i==0){
                    isPrime = false;
                    break;
                }
            }
        }
        System.out.println(num + (isPrime?" is Prime " : "is Not Prime "));
    }
}
