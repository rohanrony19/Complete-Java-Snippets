package com.rony.Intermediate.StringBB;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dog {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter name: ");
        String name = br.readLine();
        System.out.println("My name is "+ name);
    }
}
