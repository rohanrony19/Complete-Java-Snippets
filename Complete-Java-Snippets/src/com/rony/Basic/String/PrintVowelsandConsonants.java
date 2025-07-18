package com.rony.Basic.String;

public class PrintVowelsandConsonants {
    public static void main(String[] args) {
        String name = "JavaProgramming";
        name = name.toLowerCase();
        String vowels = "";
        String Consonants = "";
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                vowels = vowels + ch+',';
            }else{
                Consonants = Consonants + ch+',';
            }
        }

        System.out.println("Vowels : " + vowels ) ;
        System.out.println("Consonants : "+Consonants);
    }
}
