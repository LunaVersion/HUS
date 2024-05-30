package hus.oop.homework2.mathlibraryhomework;

public class FactorialInt {

    // Method to compute factorial of a number
    private static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            // Check for integer overflow
            if (Integer.MAX_VALUE / i < fact) {
                return -1; // Return -1 if overflow occurs
            }
            fact *= i;
        }
        return fact;
    }

    // Method to list factorials that can be expressed as an int
    public static void factorialInt() {
        int n = 1;
        while (true) {
            int fact = factorial(n);
            if (fact == -1) {
                System.out.println("The factorial of " + n + " is out of range");
                break;
            }
            System.out.println("The factorial of " + n + " is " + fact);
            n++;
        }
    }

    public static void main(String[] args) {
        factorialInt();
    }
}

