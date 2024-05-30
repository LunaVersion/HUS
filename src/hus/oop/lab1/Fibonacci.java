package hus.oop.lab1;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 3;
        int fn = 1;
        int fnMinus1 = 1;
        int fnMinus2 = 1;
        int nMax = 20;
        int sum = fnMinus1 + fnMinus2;
        double average;
        System.out.println("The first " + nMax + " Fibonacci number are:");
        System.out.print("1 1 ");


        while (n <= nMax) { // n starts from 3
            // n = 3, 4, 5, ... , nMax
            // Compute F(n), print it and add to sum
            // Increment the index n and shift the numbers for the next iteration
            ++n;
            fnMinus2 = fnMinus1;
            fnMinus1 = fn;
            fn = fnMinus1 + fnMinus2;
            System.out.print(fn + " " );
            sum = sum + fn;
        }
        average = (double) sum / 20;
        System.out.println("\nThe average is " + average);
    }
}
