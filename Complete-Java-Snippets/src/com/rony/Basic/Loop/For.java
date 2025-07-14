package com.rony.Basic.Loop;

public class For {
    public static void main(String[] args) {
        for (int i = 1; i <= 10 ; i++) {
            System.out.print(i + ",");
        }

        System.out.println();
        int n = 11;
        while(n <= 20){
            System.out.print(n+",");
            n++;
        }

        System.out.println();
        int m = 21;
        do {
            System.out.print(m+",");
            m++;
        }while (m <= 30);
    }
}
