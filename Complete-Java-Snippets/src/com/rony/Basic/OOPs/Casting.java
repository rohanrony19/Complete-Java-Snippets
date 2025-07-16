package com.rony.Basic.OOPs;

public class Casting {
    public static void main(String[] args) {
        // Typecasting
        float pi = 3.14f;
        int a = (int) pi; // NarrowCasting(Manual/Explicit)
        System.out.println(a);

        long x = 123456;
        double y = x; //
        System.out.println(y);

        System.out.println("----------------");

        //Upcasting
        class Animal{
            void show(){
                System.out.println("Parent");
            }
        }
        class Dog extends Animal{
            void show(){
                System.out.println("Child");
            }
        }
        Animal animal = new Dog();
        animal.show();

        //DownCasting
        Dog dog = (Dog) animal;
        dog.show();

    }
}
