package com.rony.Advance.Collection.ArrayList;

import java.util.*;

public class Arraylist {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(80);
        list.add(50);
        list.add(3,69);

        System.out.println(list.get(2));
        System.out.println(list.size());

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        for(int x:list){
            System.out.println(x);
        }

        System.out.println(list.contains(5));
        System.out.println(list.contains(10));

        list.remove(2);

        list.add(2,10);
        for (int y:list){
            System.out.println(y);
        }

        list.set(2,50);
        System.out.println(list);
        System.out.println(list.get(2));

        List<String> list1 = Arrays.asList("Monday","Tuesday");
        list1.set(1,"Wednesday");
        System.out.println(list1);

        String[] arr = {"Apple","Banana","berry"}; //can be modified
        List<String> list2 = Arrays.asList(arr);
        System.out.println(list2);

        List<String> list3 = new ArrayList<>(list2); // creating new list can be used to add new list
        list3.add("Mango");
        list3.add("Grapes");
        System.out.println(list3);


        List<Integer> list4 = Arrays.asList(1,2,3,4,5);

        list.addAll(list4);
        System.out.println(list);

        list3.remove("Banana");
        list.remove(Integer.valueOf(50));
        System.out.println(list3);
        System.out.println(list);

        Collections.sort(list);
        //or
        list.sort(null); // comparator
        System.out.println(list);


//        List<Integer> list3 = List.of(1,2,3,4); // can not modified

//        Object[] array = list.toArray();
//        Integer[] array1 = list.toArray(new Integer[0]);

    }
}
