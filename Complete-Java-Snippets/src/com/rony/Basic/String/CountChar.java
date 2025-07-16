package com.rony.Basic.String;

public class CountChar {
    public static void main(String[] args) {
        String fruit = "banana";

        for (int i = 0; i < fruit.length(); i++) {
            char ch = fruit.charAt(i);
            boolean alreadyCounted = false;
            for (int j = 0; j < i; j++) {
                if(fruit.charAt(j) == ch){
                    alreadyCounted = true;
                    break;
                }
            }
            if(!alreadyCounted){
                int count = 0 ;
                for (int k = 0; k < fruit.length(); k++) {
                    if(fruit.charAt(k) == ch){
                        count++;
                    }
                }
                System.out.println(ch + " -> " +count);
            }
        }
    }
}
