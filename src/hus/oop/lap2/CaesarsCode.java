package hus.oop.lap2;
import java.util.Scanner;
public class CaesarsCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a plaintext string: ");
        String inStr = sc.next().toUpperCase();
        String outStr = "";
        sc.close();

        for (int i = 0; i < inStr.length(); i++) {
            if ((inStr.charAt(i) >= 65) && (inStr.charAt(i) <= 87)) {
                char inputCharacter = inStr.charAt(i);
                char outputCharacter = (char) (inputCharacter + 3);
                outStr = outStr + outputCharacter;
            } else {
                char inputCharacter = inStr.charAt(i);
                char outputCharacter = (char) (inputCharacter - 23);
                outStr = outStr + outputCharacter;
            }

        }
        System.out.println("The cyphertext string is: " + outStr);
    }
}
