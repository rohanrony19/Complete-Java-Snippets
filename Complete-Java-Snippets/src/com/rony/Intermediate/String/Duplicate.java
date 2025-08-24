package com.rony.Intermediate.String;

import java.util.LinkedHashSet;

public class Duplicate {
    public static void main(String[] args) {
        int[] n = {1,2,2,3,4,4,5};
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int num:n){
            set.add(num);
        }
        System.out.println(set);
    }
}
