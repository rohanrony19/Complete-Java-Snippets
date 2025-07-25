package com.rony.Intermediate.Wrapper;

public class Student {
    public static void main(String[] args) {
        int a = 100;
        Integer b = a;//autoboxing
        int c = b;//unboxing

        System.out.println("a: "+a);
        System.out.println("b: "+b);
        System.out.println("c: "+c);

        System.out.println("--------------");

        int num = 10;
        //Boxing(primitive->object)
        Integer obj = Integer.valueOf(num);

        //unboxing(object->primitive)
        int newNum = obj.intValue();
        System.out.println("Original: "+num);
        System.out.println("Boxed: "+obj);
        System.out.println("Unboxed: " + newNum);

        String name = "123";
        int num2 = Integer.parseInt(name);
        System.out.println(num2);

    }
}
