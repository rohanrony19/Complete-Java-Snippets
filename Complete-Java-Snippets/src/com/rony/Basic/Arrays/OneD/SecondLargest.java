package com.rony.Basic.Arrays.OneD;

import java.util.Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr= {12,35,1,10,34,1};
        Arrays.sort(arr);
        System.out.println(arr[arr.length-2]);
    }
}
