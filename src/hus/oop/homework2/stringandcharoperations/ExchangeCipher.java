package hus.oop.homework2.stringandcharoperations;
import java.util.Scanner;
public class ExchangeCipher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a plaintext string: ");
        String inStr = sc.next().toUpperCase();
        String outStr = "";
        sc.close();

        for (int i = 0; i < inStr.length(); i++) {
            char inputCharacter = inStr.charAt(i);
            char outputCharacter = (char) (155 - inputCharacter);
            outStr = outStr + outputCharacter;
        }
        System.out.println("The cyphertext string is: " + outStr);
    }
}
