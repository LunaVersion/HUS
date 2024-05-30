package hus.oop.homework2.stringandcharoperations;
import java.util.Scanner;
public class TestPalindromicPhrase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String wort = sc.nextLine();
        char[] warray = wort.toCharArray();
        System.out.println(istPalindrom(warray));
    }

    public static boolean istPalindrom(char[] word) {
        boolean palindrom = false;
        if (word.length % 2 == 0) {
            for (int i = 0; i < word.length / 2 - 1; i++) {
                if (word[i] != word[word.length - i - 1]) {
                    return false;
                } else {
                    palindrom = true;
                }
            }
        } else {
            for (int i = 0; i < (word.length - 1) / 2 - 1; i++) {
                if (word[i] != word[word.length - i - 1]) {
                    return false;
                } else {
                    palindrom = true;
                }
            }
        }
        return palindrom;
    }
}
