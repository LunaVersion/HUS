package hus.oop.lab1;

public class Tribonacci {
    public static void main (String [] args) {
        int n = 3;
        int fnMinus1 = 1;
        int fnMinus2 = 0;
        int fnMinus3 = 0;
        int nMax = 20;

        System.out.println("The first " + nMax + " Tribonacci numbers are: ");
        System.out.print("1 1 ");
        int fn = 1;

        while (n <= nMax) { // n starts from 3
            // n = 3, 4, 5, ... , nMax
            // Compute F(n), print it and add to sum
            // Increment the index n and shift the numbers for the next iteration
            ++n;
            fnMinus3 = fnMinus2;
            fnMinus2 = fnMinus1;
            fnMinus1 = fn;
            fn = fnMinus1 + fnMinus2 + fnMinus3;
            System.out.print(fn + " " );
        }
    }
}
