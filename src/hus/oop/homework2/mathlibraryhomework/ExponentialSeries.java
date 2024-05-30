package hus.oop.homework2.mathlibraryhomework;

public class ExponentialSeries {
    public static double specialSeries(double x, int numTerms) {
        double result = 0;
        for (int i = 0; i < numTerms; i++) {
            double term = Math.pow(x, i) / factorial(i);
            result += term;
        }
        return result;
    }

    // Method to compute factorial of a number
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

    public static void main(String[] args) {
        double x = 2.0; // Example value of x
        int numTerms = 10; // Number of terms in the series
        double result = specialSeries(x, numTerms);
        System.out.println("Result of special series for x = " + x + " with " + numTerms + " terms: " + result);
    }
}
