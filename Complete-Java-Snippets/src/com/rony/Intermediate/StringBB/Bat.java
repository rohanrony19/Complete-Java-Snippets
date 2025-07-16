package com.rony.Intermediate.StringBB;

public class Bat {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Thread");
        sb.append(" Safe");
        sb.reverse();

        System.out.println(sb);
    }
}
