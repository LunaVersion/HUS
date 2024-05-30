package hus.oop.lab4_old;
import java.util.Scanner;
public class PerfectPrimeFactorList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the upper bound (positive integer): ");
        int upperBound = sc.nextInt();
        printPerfectPrimeFactors(upperBound);

        sc.close();
    }

    public static boolean isPrime(int posInt) {
        for (int i = 2; i <= Math.sqrt(posInt); i++) {
            if (posInt%i != 0) {
                continue;
            }
            return false;
        }
        return true;
    }

    public static boolean isProductOfPrimeFactors(int posInt) {
        if (posInt == 1) return false;
        int prod = 1;
        for (int i = 2; i < posInt; i++) {
            prod *= isPrime(i) && (posInt%i == 0) ? i : 1;
        }
        return (prod == posInt);
    }

    public static void printPerfectPrimeFactors(int upperBound) {
        System.out.println("These numbers are equal to the product of prime factors: ");
        int countProductOfPrimeFactors = 0;
        for (int i = 1; i <= upperBound; i++) {
            if (! isProductOfPrimeFactors(i)) {
                continue;
            }
            System.out.printf("%1$d ", i);
            countProductOfPrimeFactors++;
        }
        System.out.printf("\n[%1$d numbers found (%2$.2f%%)]\n", countProductOfPrimeFactors, ((double) 100 * countProductOfPrimeFactors/upperBound));
    }

}
