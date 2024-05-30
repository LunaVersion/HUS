package hus.oop.lap2;
import java.util.Scanner;
public class Bin2Dec {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Binary string: ");
        String binaryString = sc.next();
        sc.close();
        try {
            int decimal = Integer.parseInt(binaryString,2);
            System.out.printf("The equivalent decimal number for \"%s\" is: " + decimal, binaryString);
        } catch (Exception e) {
            System.out.printf("Error: Invalid binary string \"%s\"",binaryString);
        }
    }
}
