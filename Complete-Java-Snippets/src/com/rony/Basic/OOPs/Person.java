package com.rony.Basic.OOPs;

public class Person {
    String name;
    int age;

    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    public void show(){
        System.out.println("Name: " +name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Person person = new Person("Rohan",22);
        person.show();
    }
}
