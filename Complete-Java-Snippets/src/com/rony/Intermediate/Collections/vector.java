package com.rony.Intermediate.Collections;

import java.util.Vector;

public class vector {
    public static void main(String[] args) {
        Vector<Integer> a = new Vector<>(3,2);
        a.addElement(1);
        a.addElement(2);
        a.addElement(3);
        a.addElement(4);
        a.insertElementAt(4,2);
        a.removeElement(3);
        for (int n:a){
            System.out.println(n);
        }
    }
}
