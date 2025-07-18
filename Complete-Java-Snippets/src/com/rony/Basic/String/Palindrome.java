package com.rony.Basic.String;

import java.lang.String;

public class Palindrome {
    public static void main(String[] args) {
        String name = "madam";
        String rev = "";
        for (int i = name.length()-1; i >= 0; i++) {
            rev = rev + name.charAt(i);
        }
        if(name.equals(rev)){
            System.out.println(name + " is Palindrome");
        }else {
            System.out.println(name + " is not Palindrome");
        }
    }
}
