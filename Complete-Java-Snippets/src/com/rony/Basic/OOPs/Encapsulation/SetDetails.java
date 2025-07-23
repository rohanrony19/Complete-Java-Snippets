package com.rony.Basic.OOPs.Encapsulation;

public class SetDetails {
    public static void main(String[] args) {
        Details details = new Details();
        details.setName("Raji");
        details.setAge(23);
        System.out.println("Name: " +details.getName());
        System.out.println("Age: " + details.getAge());
    }
}
