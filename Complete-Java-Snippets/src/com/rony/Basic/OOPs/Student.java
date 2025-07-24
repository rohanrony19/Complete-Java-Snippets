package com.rony.Basic.OOPs;

public class Student {
    String name;
    int rollNumber;

    public void display(){
        System.out.println("Name: " + name);
        System.out.println("Roll Number: "+rollNumber);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Rohan";
        s1.rollNumber = 21;

        s1.display();

    }
}
