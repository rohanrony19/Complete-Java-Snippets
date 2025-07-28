package com.rony.Advance.Collection.Stack;

import com.rony.Advance.Collection.Vector.Thread;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {
    public static void main(String[] args) {
        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();
        List<String> shoppingList = new CopyOnWriteArrayList<>();
        shoppingList.add("Milk");
        shoppingList.add("Eggs");
        shoppingList.add("Bread");
        System.out.println("Initial shopping List: " +shoppingList);

        // reading and modifying
        for(String item:shoppingList){
            System.out.println(item);
            if(item.equals("Eggs")){
                shoppingList.add("Butter");
                System.out.println("Added Butter while reading");
            }
        }
        System.out.println("Updated HSopping List: " + shoppingList);
    }
}
