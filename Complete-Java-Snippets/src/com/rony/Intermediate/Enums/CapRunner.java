package com.rony.Intermediate.Enums;

import java.util.logging.Level;

import static com.rony.Intermediate.Enums.Cap.*;

public class CapRunner {
    public static void main(String[] args) {
        Cap myCap = Cap.MEDIUM;

        System.out.println("Selected Cap : " + myCap);

        switch (myCap) {
            case LOW:
                System.out.println("Low capacity selected");
                break;
            case MEDIUM:
                System.out.println("Medium capacity selected");
                break;
            case HIGH:
                System.out.println("High capacity selected");
                break;
        }
        System.out.println("All Cap Values: ");
        for(Cap c : Cap.values()){
            System.out.println(c);
        }
    }
}
