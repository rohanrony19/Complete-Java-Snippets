package com.rony.Basic.DataTypes;

import java.util.Scanner;

public class Variable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.next();
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        System.out.println("My hobbies are: ");
        String hobby = sc.next();
        System.out.println("My name is "+name+", and am "+age+" year old and my hobbies are "+hobby);
    }
}
