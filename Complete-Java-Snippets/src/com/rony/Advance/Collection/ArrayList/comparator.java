package com.rony.Advance.Collection.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class IntegerLengthComparator implements Comparator<Integer>{

    @Override
    public int compare(Integer o1,Integer o2){
        return o2-o1; //reverse order
//        return o1-o2; ordered
    }
}

class StringLengthComparator implements Comparator<String >{

    @Override
    public int compare(String s1, String s2) {
        return s1.length()-s2.length(); //ordered length
//        return s2.length()-s1.length(); //reverse ordered length
    }
}
public class comparator {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(4);
        list.add(11);
        list.add(50);
        list.add(1);
        list.sort(new IntegerLengthComparator());
        System.out.println(list);

        List<String> list1 = Arrays.asList("Aeroplane","Bike","Scooty","Car");
        list1.sort(new StringLengthComparator());
        System.out.println(list1);

    }
}
