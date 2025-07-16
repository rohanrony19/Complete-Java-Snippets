package com.rony.Basic.OOPs;

public class Car {
    String brand;
    String color;

    void move(){
        System.out.println("Brand : "+ brand + ", " + "Color: " + color);
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.brand = "Lamborghini";
        car.color = "Blue";

        Car car1 = new Car();
        car1.brand = "Dodge";
        car1.color = "Black";

        car.move();
        car1.move();
    }
}
