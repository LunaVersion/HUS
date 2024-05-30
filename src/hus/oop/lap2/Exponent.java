package hus.oop.lap2;

import java.util.Scanner;

public class Exponent {
    public static void main(String[] args) {
        System.out.print("Enter the base: ");
        int base = sc.nextInt();
        System.out.print("Enter the exp: ");
        int exp = sc.nextInt();
        System.out.print(base+ " raise to the power of "+ exp+" is: " + exponent(base,exp));
    }
    public static Scanner sc = new Scanner(System.in);

    public static int exponent(int base, int exp){
        int value = 1;
        for (int i = 0; i<exp; i++){
            value = value*base;
        }
        return value;
    }

}
