package com.rony.Basic.OOPs.Inheritance.Heirarchical;

public class ItStartsWithUs extends Book {
    public ItStartsWithUs(){
        System.out.println("Running It Starts with us");
    }
    void store(){
        super.store();
        System.out.println("Purchased It Starts with us");
    }
}
