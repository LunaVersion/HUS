package hus.oop.lab3;

public class GreatestCommonDivisor {
    public static int gcd(int a, int b) {
        // Base case: if b is 0, then GCD(a, b) = a
        if (b == 0) {
            return a;
        }
        // Recursive case: GCD(a, b) = GCD(b, a % b)
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        // Test the gcd method
        int a = 24;
        int b = 18;
        System.out.println("GCD of " + a + " and " + b + " is: " + gcd(a, b));
    }
}
