package com.rony.Advance.Collection.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ComparatorUsingLambda {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(56);
        list.add(23);
        list.add(4);
        list.add(18);   
        list.sort((a,b)->b-a);
        System.out.println(list);

        List<String> list1 = Arrays.asList("Papaya","Apple","Pie","Watermelon","Guva");
        list1.sort((x,y)->x.length()-y.length());
        System.out.println(list1);

    }
}
