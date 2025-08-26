package com.rony.Intermediate.String;

public class SecondLargest {
    public static void main(String[] args) {
        int[] num = {4,7,1,9,3};
        int large = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for (int n : num){
            if(n > large){
                second = large;
                large = n;
            }else if(n > second && n != large){
                second = n;
            }
        }


        System.out.println("Second largest: " + second);
    }
}
