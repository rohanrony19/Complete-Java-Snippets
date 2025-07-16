package com.rony.Intermediate.StringBB;

public class Ant {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java");
        sb.append("Programming");
        System.out.println(sb);
        sb.insert(0,"Welcome to ");
        System.out.println(sb);
        sb.replace(11,15,"Core");
        System.out.println(sb);
        sb.delete(5,9);
        System.out.println(sb);
    }
}
