package hus.oop.lap2;
import java.util.Scanner;
public class Hex2Dec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Hexadecimal string: ");
        String hexString = sc.next();
        sc.close();
        try {
            int decimal = Integer.parseInt(hexString,16);
            System.out.printf("The equivalent decimal number for \"%s\" is: " + decimal, hexString);
        } catch (Exception e) {
            System.out.printf("Error: Invalid hexadecimal string \"%s\"",hexString);
        }
    }
}
