package com.rony.Intermediate.Exception;

public class CustomException {
    public static void main(String[] args) {
        int age = 16;
        try{
            if(age<18){
                throw new Custom("You must be 19 or older");
            }else {
                System.out.println("Eligible for vote");
            }
        }catch (Custom e){
            System.out.println("custom Exception Caught: " + e.getMessage());
        }
    }
}
