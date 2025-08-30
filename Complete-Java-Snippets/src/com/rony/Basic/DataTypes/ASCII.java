package com.rony.Basic.DataTypes;

import java.util.Scanner;

public class ASCII {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a character:");
        char ch = in.next().charAt(0);
        int ascii = (int)ch;

        System.out.print("Enter the number");
        int num = in.nextInt();
        char ch1 = (char) num;

        System.out.println("ASCII value of '" + ch + "' is: " + ascii);
        System.out.println("ASCII value of '" + num + "' is: " + ch1);
    }
}
