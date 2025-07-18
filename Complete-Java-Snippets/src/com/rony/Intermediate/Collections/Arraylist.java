package com.rony.Intermediate.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

public class Arraylist {
    public static void main(String[] args) {
        Collection<Object> a = new ArrayList<>();
        a.add(10);
        a.add(3.5);
        a.add(null);
        a.add(true);
        a.add("hello");
        System.out.println(a);
        System.out.println(a.size());
        System.out.println(a.contains(20));
        a.remove(null);
        System.out.println(a);
        System.out.println(a.isEmpty());

        ArrayList<Object> b = new ArrayList<>();
        b.add(14);
        b.add(55);
        b.add(60);
        b.add(10);
        System.out.println(b);
        System.out.println(b.get(2));
        System.out.println(a.retainAll(b));

        a.clear();
        for(Object n : a){
            System.out.println(n);
        }
    }
}
