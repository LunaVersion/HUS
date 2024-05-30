package hus.oop.lap2;
import java.util.Scanner;
public class CountVowelsDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String inStr = sc.next().toUpperCase();
        int vowelsCount = 0;
        int digitsCount = 0;
        sc.close();

        char[] vowelsChar = {'A','E','I','O','U'};

        for (int i = 0; i < inStr.length(); i++) {
            if (inStr.charAt(i) >= '0' && inStr.charAt(i) <= '9') {
                digitsCount++;
            } else
                for (int j = 0; j < vowelsChar.length; j++) {
                    if (inStr.charAt(i) == vowelsChar[j]) {
                        vowelsCount++;
                    }
                }
        }
        double digitsPercent = (double) ((digitsCount * 10000) / inStr.length()) / 100;
        double vowelsPercent = (double) ((vowelsCount * 10000) / inStr.length()) / 100;
        System.out.printf("Number of vowels: " + vowelsCount + " (%s%%)", Double.toString(vowelsPercent));
        System.out.printf("\nNumber of digits: " + digitsCount + " (%s%%)", Double.toString(digitsPercent));
    }

}
