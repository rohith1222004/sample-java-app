package main.java.com.example;

public class App {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int result = calc.add(5, 3);
        System.out.println("Result: " + result);
        int a = 10;
        int b = 0;
        int result = a / b; // ❌ ArithmeticException
        int[] arr = {1, 2, 3};
        System.out.println(arr[5]);

        String s = null;
        System.out.println(s.length());

        String a = "test";
        String b = new String("test");
        
        if (a == b) { // ❌ wrong comparison
            System.out.println("Equal");
        }
    }
}
