package com.rony.Basic.Arrays.OneD;

import java.util.Arrays;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] arr = {2,4,2,8,4,6,8};
        Arrays.sort(arr);
        for (int i = 1; i < arr.length-1; i++) {
            if(arr[i] != arr[i+1]){
                System.out.println(arr[i]);
            }
        }
    }
}
