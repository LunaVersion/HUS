package hus.oop.lap2;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        testBinaryToDecimal();
    }
    public static int binaryToDecimal(String binStr){
        int inStrLen = binStr.length();
        String reverseStr = "";

        for (int i = inStrLen - 1; i >= 0; i--) {
            reverseStr = reverseStr + binStr.charAt(i);
        }
        int decimal = 0;
            for (int i = 0; i < reverseStr.length(); i++) {
                if (reverseStr.charAt(i) == 49) {
                    decimal += Math.pow(2, i);
                }
                if (reverseStr.charAt(i) == 48) {
                    decimal += 0;
                }
            }
        return decimal;
    }

    public static void testBinaryToDecimal(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Binary string: ");
        String input = sc.nextLine();
        if(isBinaryString(input)) {
            System.out.print("The equivalent decimal number for binary " + input + " is: " + binaryToDecimal(input));
        }
        else{
            System.out.println("Invalid binary string!");
        }
    }

    public static boolean isBinaryString(String string){
        for (int i = 0; i < string.length(); i++) {
            if(string.charAt(i) != 48 && string.charAt(i) != 49){
                return false;
            }
        }
        return true;
    }
}
