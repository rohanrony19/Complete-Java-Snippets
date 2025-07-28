package com.rony.Advance.Collection.Stack;

import java.util.LinkedList;
import java.util.Stack;
// LIFO = cookie order
public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        Integer peek = stack.peek();
        System.out.println(peek); //Last element
        System.out.println(stack.isEmpty());
        System.out.println(stack.size());
        stack.add(4,5);
        System.out.println(stack);
        int search = stack.search(2);
        //5 = 1
        //4 = 2
        //3 = 3
        //2 = 4
        //1 = 5
        System.out.println(search);

        LinkedList<Integer> list = new LinkedList<>(stack);
        list.addLast(10);
        list.addLast(9);
        list.addLast(8);
        System.out.println(list);
//        System.out.println(stack);
        list.removeFirst();
        System.out.println(list);
    }
}
