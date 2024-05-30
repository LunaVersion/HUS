package hus.oop.homework2.mathlibraryhomework;

public class FibonacciInt {

    // Method to calculate the nth Fibonacci number
    private static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int temp = b;
            b = a + b;
            a = temp;
            // Check for integer overflow
            if (b < 0) {
                return -1; // Return -1 if overflow occurs
            }
        }
        return b;
    }

    // Method to list Fibonacci numbers that can be expressed as an int
    public static void fibonacciInt() {
        int n = 0;
        while (true) {
            int fib = fibonacci(n);
            if (fib == -1) {
                System.out.println("F(" + n + ") is out of the range of int");
                break;
            }
            System.out.println("F(" + n + ") = " + fib);
            n++;
        }
    }

    public static void main(String[] args) {
        fibonacciInt();
    }
}

