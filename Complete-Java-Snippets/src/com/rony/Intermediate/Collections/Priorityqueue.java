package com.rony.Intermediate.Collections;

import java.util.PriorityQueue;

public class Priorityqueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> p = new PriorityQueue<>();
        p.add(1);
        p.add(-2);
        p.add(44);
        p.add(0);
        p.add(18);
        System.out.println(p);
    }
}
