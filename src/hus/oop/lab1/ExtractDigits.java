package hus.oop.lab1;

import java.util.Scanner;
public class ExtractDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int inputInt = sc.nextInt();
        sc.close();

        while (inputInt > 0) {
            int digit = inputInt % 10;
            System.out.print(digit + " ");
            inputInt = inputInt / 10;
        }
    }
}
