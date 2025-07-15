package com.rony.Intermediate.Arrays.OneD;

import java.util.Arrays;

public class AscendingOrder {
    public static void main(String[] args) {
        int[] arr = { 4,7,2,9,1};
        Arrays.sort(arr);

        System.out.print("Sorted arrays : ");
        for (int num : arr){
            System.out.print(num + " ");
        }
    }
}
