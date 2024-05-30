package hus.oop.homework2.mathlibraryhomework;

import java.math.BigInteger;

public class NumberSystemConversion {
    public static String toRadix(String in, int inRadix, int outRadix) {
        // Convert the input string to BigInteger in the input radix
        BigInteger num = new BigInteger(in, inRadix);
        // Convert the BigInteger to a string in the output radix
        return num.toString(outRadix);
    }

    // Method to test number conversion
    public static void testNumberConversion() {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter a number and radix: ");
        String number = input.next();
        System.out.print("Enter the input radix: ");
        int inRadix = input.nextInt();
        System.out.print("Enter the output radix: ");
        int outRadix = input.nextInt();

        String convertedNumber = toRadix(number, inRadix, outRadix);
        System.out.println("'" + number + "' in radix " + inRadix + " is '" + convertedNumber + "' in radix " + outRadix);
        input.close();
    }

    public static void main(String[] args) {
        testNumberConversion();
    }
}
