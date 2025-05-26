package main.java.com.example;

public class App {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // Division by zero test
        int result = calc.divide(5, 0);
        System.out.println("Result: " + result);

        // Check prime
        System.out.println("Is 97 prime? " + calc.isPrime(97));

        // Bad logging
        calc.login("admin", "SuperSecret123");
    }
}
