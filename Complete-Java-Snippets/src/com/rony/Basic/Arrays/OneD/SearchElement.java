package com.rony.Basic.Arrays.OneD;

public class SearchElement {
    public static void main(String[] args) {
        int[] arr = {100,200,300,400};
        int target = 300;
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                System.out.println("Found "+target+" at index "+i);
                found = true;
                break;

            }

        }
        if(!found){
            System.out.println(target + " not found");
        }
    }
}
