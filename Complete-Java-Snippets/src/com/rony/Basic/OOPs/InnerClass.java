package com.rony.Basic.OOPs;

public class InnerClass {
    class A{
        int age;

        public void show(){
            System.out.println("Running show");
        }
            class B{
            public void config(){
                System.out.println("Running Config");
            }
        }
    }

    public static void main(String[] args) {
       InnerClass a = new InnerClass();
       A innerA = a.new A();
       innerA.show();

       A.B innerB = innerA.new B();
        innerB.config();
    }
}
