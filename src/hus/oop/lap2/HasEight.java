package hus.oop.lap2;

import java.util.Scanner;

public class HasEight {
    public static void main(String[] args) {
        magicSum();
    }
    public static Scanner sc = new Scanner(System.in);

    public static boolean hasEight(int number) {
        int digit;
        while (number != 0) {
            digit = number % 10;
            if (digit == 8)
                return true;
            number = number / 10;
        }
        return false;
    }
    public static void magicSum(){
        final int SENTINEL = -1;
        int sum = 0;
        System.out.print("Enter a positive interger (or -1 to end): ");
        int number = sc.nextInt();

        while (number != SENTINEL) {
            if(hasEight(number) == true){
                sum = sum + number;
            }
            System.out.print("Enter a positive interger (or -1 to end): ");
            number = sc.nextInt();
        }
        System.out.print("The magic sum is: " + sum);
    }
}
