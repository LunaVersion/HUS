package hus.oop.lap2;
import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String inStr = sc.next();
        sc.close();
        printReverseString(inStr);
    }
    public static void printReverseString(String inStr) {
        int inStrLen = inStr.length();
        String reverseStr = "";

        for (int i = inStrLen - 1; i >= 0; i--) {
            reverseStr = reverseStr + inStr.charAt(i);
        }
        System.out.printf("The reverse of the string \"%s\" is \"%s\" ", inStr, reverseStr);
    }

}
