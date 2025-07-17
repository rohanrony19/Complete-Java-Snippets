package com.rony.Intermediate.Enums;

public enum Laptop {
    Macbook(2000),XPS(2200),Surface(1500),ThinkPad(1800);
    private int price;

    private Laptop(int price){
        this.price = price;
    }

    public int getPrice(){
        return price;
    }
}
