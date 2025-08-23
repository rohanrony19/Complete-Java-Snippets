package com.rony.Intermediate.String;

public class CountVowels {
    public static void main(String[] args) {
        String name = "Java Programming";
        int count = 0;
        for (int i = 0; i < name.length()-1; i++) {
            char ch = name.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count++;
            }

        }
        System.out.println(count);
    }
}
