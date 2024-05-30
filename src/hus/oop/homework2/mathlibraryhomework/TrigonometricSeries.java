package hus.oop.homework2.mathlibraryhomework;

public class TrigonometricSeries {
    private static long factorial(int n) {
        if (n == 0) {
            return 1;
        }
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static double sin(double x, int n) {
        double result = x;
        for (int i = 1; i < n; i++) {
            result += Math.pow(-1, i) * Math.pow(x, 2 * i + 1) / factorial(2 * i + 1);
        }
        return result;
    }

    public static double cos(double x, int n) {
        double result = 1;
        for (int i = 1; i < n; i++) {
            result += Math.pow(-1, i) * Math.pow(x, 2 * i) / factorial(2 * i);
        }
        return result;
    }

    public static void main(String[] args) {
        double x = Math.PI / 4; // Example value of x (in radians)
        int n = 10; // Number of terms in the series expansion
        System.out.println("sin(" + x + ") = " + sin(x, n));
        System.out.println("cos(" + x + ") = " + cos(x, n));
    }
}
