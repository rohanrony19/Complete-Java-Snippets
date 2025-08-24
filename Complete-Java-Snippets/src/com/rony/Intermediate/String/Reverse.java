package com.rony.Intermediate.String;

public class Reverse {
    public static void main(String[] args) {
        String name = "Rohan";
        String rev = "";
        for (int i = name.length()-1; i >= 0 ; i--) {
            rev = rev + name.charAt(i);
        }
        System.out.println("Reversed String: " + rev);
    }
}
