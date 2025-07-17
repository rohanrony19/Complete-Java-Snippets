package com.rony.Basic.OOPs.Inheritance.Heirarchical;

public class ItEndsWithUs extends Book{
    public  ItEndsWithUs(){
        System.out.println("Running It Ends with us");
    }

    @Override
    void store() {
        super.store();
        System.out.println("Purchased It Ends with us");
    }
}
