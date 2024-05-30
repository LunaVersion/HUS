package hus.oop.lap2;
import java.util.Scanner;
public class RadixN2Dec {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radix: ");
        int radix = sc.nextInt();
        System.out.print("Enter the string: ");
        String radixString = sc.next();
        sc.close();
        try {
            int decimal = Integer.parseInt(radixString,radix);
            System.out.printf("The equivalent decimal number for \"%s\" is: " + decimal, radixString);
        } catch (Exception e) {
            System.out.printf("Error: Invalid radix string \"%s\"",radixString);
        }
    }
}
