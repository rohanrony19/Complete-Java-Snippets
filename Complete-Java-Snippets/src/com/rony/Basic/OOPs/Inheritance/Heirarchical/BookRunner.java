package com.rony.Basic.OOPs.Inheritance.Heirarchical;

public class BookRunner {
    public static void main(String[] args) {
        Book book = new ItStartsWithUs();
        book.store();
        System.out.println("--------------------");
        Book book1 = new ItEndsWithUs();
        book1.store();
    }
}
