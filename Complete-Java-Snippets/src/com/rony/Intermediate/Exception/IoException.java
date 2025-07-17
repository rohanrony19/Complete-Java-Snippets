package com.rony.Intermediate.Exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class IoException extends Throwable {
    public static void main(String[] args) {
        try{
            FileReader reader = new FileReader("sample.txt");

            int data;
            while ((data = reader.read()) != -1){
                System.out.println((char) data);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("IOException occured: " );
        }
    }
}
