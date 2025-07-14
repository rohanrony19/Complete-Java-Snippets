package com.rony.Basic.DataTypes;

import java.util.Scanner;

// Celsius to Fahrenheit
public class Celsius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature Celsius : ");
        float celsius = sc.nextFloat();
        float fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("Temperature in Fahrenheit : "+fahrenheit);
    }
}
