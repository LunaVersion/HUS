package hus.oop.lap2;
import java.util.Scanner;
public class Oct2Dec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Octal string: ");
        String octString = sc.next();
        sc.close();
        try {
            int decimal = Integer.parseInt(octString,8);
            System.out.printf("The equivalent decimal number for \"%s\" is: " + decimal, octString);
        } catch (Exception e) {
            System.out.printf("Error: Invalid octal string \"%s\"",octString);
        }
    }
}
