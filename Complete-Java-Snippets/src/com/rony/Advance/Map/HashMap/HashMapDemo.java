package com.rony.Advance.Map.HashMap;

import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(2,"Akash");
        map.put(4,"Bhoomika");
        map.put(1,"Charan");
        map.put(1,"Chimayee");
//        map.put(5,null);
//        map.put(null,"Rahul");
//        map.put(null,"Sonia");
        System.out.println(map);

        String student = map.get(4); //O(1)
        System.out.println(student);
        System.out.println(map.get(6));
        System.out.println(map.containsKey(4));
        boolean Value = map.containsValue("Akash");
        System.out.println(Value);

        Set<Integer> keys = map.keySet();
        for (int i : keys){
            System.out.println(map.get(i));
        }

        Set<Map.Entry<Integer, String>> entries = map.entrySet() ;
        for (Map.Entry<Integer, String> entry:entries){
            System.out.println(entry.getKey() + ": " + entry.getValue().toUpperCase());
        }

        map.remove(2); 
        System.out.println(map);


    }
}
