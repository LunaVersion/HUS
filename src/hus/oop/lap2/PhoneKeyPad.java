package hus.oop.lap2;
import java.util.Scanner;
public class PhoneKeyPad {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a letter: ");
//        char inChar = sc.next().toLowerCase().charAt(0);
//        sc.close();

        testPhoneKeyPad();
    }
    public static String phoneKeyPad(String inStr) {
        String inChar = "";
        for (int i = 0; i < inStr.length(); i++) {
            switch (inStr.charAt(i)) {
                case 'a':
                case 'b':
                case 'c':
                    inChar = inChar + "2";
                    break;
                case 'd':
                case 'e':
                case 'f':
                    inChar = inChar + "3";
                    break;
                case 'g':
                case 'h':
                case 'i':
                    inChar = inChar + "4";
                    break;
                case 'k':
                case 'l':
                case 'm':
                    inChar = inChar + "5";
                    break;
                case 'n':
                case 'o':
                case 'p':
                    inChar = inChar + "6";
                    break;
                case 'q':
                case 'r':
                case 's':
                    inChar = inChar + "7";
                    break;
                case 't':
                case 'u':
                case 'v':
                    inChar = inChar + "8";
                    break;
                case 'w':
                case 'x':
                case 'y':
                case 'z':
                    inChar = inChar + "9";
                    break;
                default:
                    if(inStr.charAt(i) <= 57 && inStr.charAt(i) >= 48){
                        inChar = inChar + inStr.charAt(i);
                    }
            }

        }
        return inChar;
    }
    public static void testPhoneKeyPad() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the input: ");
        String input = sc.nextLine();
        System.out.println(phoneKeyPad(input));
    }
}

