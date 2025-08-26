package com.rony.Intermediate.String;

public class SumOfEven {
    public static void main(String[] args) {
        int[] num = {2,5,8,10};
        int sum = 0;
        for (int i = 0; i <= num.length-1; i++) {
            if(num[i] %2==0){
                sum = sum + num[i];
            }
        }
        System.out.println(sum);

        //or
//
//        for(int n:num){
//            if(n%2==0){
//                sum += n;
//            }
//        }
//        System.out.println(sum);
    }
}
