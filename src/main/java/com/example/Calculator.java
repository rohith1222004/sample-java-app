package main.java.com.example;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            System.err.println("Division by zero");
            return 0; // Bad practice for CodeGuru to catch!
        }
        return a / b;
    }
}
