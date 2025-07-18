package com.rony.Intermediate.Collections;

import java.util.LinkedHashSet;

public class Linekedhashset {
    public static void main(String[] args) {
        LinkedHashSet<Object> l = new LinkedHashSet<>();
        l.add(null);
        l.add(24);
        l.add(4);
        l.add(-4);
        l.add(true);
        System.out.println(l);
    }
}
