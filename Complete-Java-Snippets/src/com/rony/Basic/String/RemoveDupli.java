package com.rony.Basic.String;

public class RemoveDupli {
    public static void main(String[] args) {
        String str = "programming";
        String res = "";
        for (int i = 0; i < str.length()-1; i++) {
            char ch = str.charAt(i);
            if(ch != str.charAt(i+1)){
                res = res + ch;
            }
        }
        System.out.println(res);
    }
}
