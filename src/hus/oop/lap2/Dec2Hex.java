package hus.oop.lap2;

import java.util.Scanner;

public class Dec2Hex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decilal number: ");
        int n = sc.nextInt();
        decToHexa(n);
    }

    public static void decToHexa(int n) {
        System.out.println("The equivalent hexadecimal number is " + (Integer.toHexString(n).toUpperCase()));
    }

}
