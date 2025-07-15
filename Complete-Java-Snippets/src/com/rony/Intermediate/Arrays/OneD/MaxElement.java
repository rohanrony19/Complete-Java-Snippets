package com.rony.Intermediate.Arrays.OneD;

public class MaxElement {
    public static void main(String[] args) {
        int[] arr = {12,45,7,89,32};
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("Maximum = "+max);
    }
}
