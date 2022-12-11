package com.neotech.lesson35;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class ThrowsKeyword {
    public static void main(String[] args) {
        calculator();
        try {
            read("/files/one.pdf");
        } catch (FileNotFoundException e) {
            // TODO: handle exception
            System.out.println("File not found!");
        }
    }
    public static void calculator() {
        try {
            division(9, 3);
            division(10, 0);
        } catch (ArithmeticException ex) {
            System.out.println("ArithmeticException handled");
            ex.printStackTrace();
        }
    }
    public static void division(int a, int b) throws ArithmeticException {
        System.out.println(a / b);
    }
    public static void read(String filePath) throws FileNotFoundException {
        FileInputStream fis = new FileInputStream(filePath);
    }


}
