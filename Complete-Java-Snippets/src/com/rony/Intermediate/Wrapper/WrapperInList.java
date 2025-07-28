package com.rony.Intermediate.Wrapper;

import java.util.ArrayList;

//store Integers in ArrayList
public class WrapperInList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        //Autoboxing: primitive -> wrapper
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        for(Integer n : numbers){
            System.out.println("Numbers: " + n);
        }
    }
}
