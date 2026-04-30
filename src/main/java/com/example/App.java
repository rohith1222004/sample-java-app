package main.java.com.example;

import java.io.FileInputStream;
import java.io.IOException;

public class App {
    public static void main(String[] args) {

        // 1. Null Pointer Issue
        String s = null;
        System.out.println(s.length()); // ❌ NullPointerException

        // 2. Division by zero
        int a = 10;
        int b = 0;
        int result = a / b; // ❌ ArithmeticException
        System.out.println(result);

        // 3. Array Index Out of Bounds
        int[] arr = {1, 2, 3};
        System.out.println(arr[5]); // ❌ IndexOutOfBoundsException

        // 4. Unclosed resource
        try {
            FileInputStream fis = new FileInputStream("test.txt");
            int data = fis.read();
            System.out.println(data);
            // ❌ fis not closed
        } catch (IOException e) {
            // 5. Empty catch block (bad practice + reliability issue)
        }

        // 6. Infinite recursion risk
        recursiveMethod();
    }

    public static void recursiveMethod() {
        recursiveMethod(); // ❌ StackOverflowError
    }
}
