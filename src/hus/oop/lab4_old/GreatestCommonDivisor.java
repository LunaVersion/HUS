package hus.oop.lab4_old;
import java.util.Scanner;
public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int firstNumber = sc.nextInt();
        System.out.print("Enter the second number: ");
        int secondNumber = sc.nextInt();
        sc.close();

        if (firstNumber > secondNumber) {
            int tempNum = firstNumber;
            firstNumber = secondNumber;
            secondNumber = tempNum;
        }

        System.out.printf("GCD of %d and %d is: %d", firstNumber, secondNumber, gcd(firstNumber, secondNumber));
    }

    public static int gcd(int firstNumber, int secondNumber) {
        if (secondNumber == 0) return firstNumber;
        else return gcd(secondNumber, firstNumber % secondNumber);
    }
}
