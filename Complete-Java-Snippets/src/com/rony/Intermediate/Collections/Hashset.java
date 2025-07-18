package com.rony.Intermediate.Collections;

import java.util.HashMap;
import java.util.HashSet;

public class Hashset {
    public static void main(String[] args) {
        HashSet<Object> h = new HashSet<>();
        h.add(null);
        h.add(-1);
        h.add(88);
        h.add(0);
        h.add(-44);
        System.out.println(h);
    }
}
