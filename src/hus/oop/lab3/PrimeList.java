package hus.oop.lab3;

import java.util.Scanner;

public class PrimeList {
    public static boolean isPrime(int aPosInt) {
        if (aPosInt <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(aPosInt); i++) {
            if (aPosInt % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Method to list prime numbers up to a given upper bound
    public static void listPrimes(int upperBound) {
        int countPrimes = 0;
        System.out.println("Prime numbers up to " + upperBound + ":");
        for (int i = 2; i <= upperBound; i++) {
            if (isPrime(i)) {
                System.out.println(i);
                countPrimes++;
            }
        }
        System.out.println("\nPercentage of prime numbers: " + String.format("%.2f", ((double) countPrimes / upperBound) * 100) + "%");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an upper bound (a positive integer): ");
        int upperBound = scanner.nextInt();
        scanner.close();
        listPrimes(upperBound);
    }
}
