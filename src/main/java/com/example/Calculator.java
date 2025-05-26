package main.java.com.example;

public class Calculator {

    // Bad practice: not checking for overflow
    public int add(int a, int b) {
        return a + b;
    }

    // Bad practice: division by zero just logs error and returns wrong result
    public int divide(int a, int b) {
        if (b == 0) {
            System.err.println("Division by zero occurred.");
            return 0; // wrong fallback
        }
        return a / b;
    }

    // New method with inefficient logic
    public boolean isPrime(int number) {
        if (number <= 1)
            return false;
        for (int i = 2; i < number; i++) { // not optimized
            if (number % i == 0)
                return false;
        }
        return true;
    }

    // Bad practice: inefficient infinite loop and resource leak (no close)
    public void processData() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        while (true) { // infinite loop with no break condition
            String input = scanner.nextLine();
            if (input.equals("exit")) {
                break; // missing scanner.close() causes resource leak
            }
            System.out.println("Processing: " + input);
        }
        // scanner.close(); // intentionally omitted to cause resource leak warning
    }

    // Bad: logging sensitive info (simulated)
    public void login(String username, String password) {
        System.out.println("Logging in with: " + username + " / " + password);
    }
}
