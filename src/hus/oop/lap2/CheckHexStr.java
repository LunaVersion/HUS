package hus.oop.lap2;
import java.util.Scanner;
public class CheckHexStr {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a plaintext string: ");
        String inStr = sc.next();
        String upperInStr = inStr.toUpperCase();
        sc.close();

        for (int i = 0; i < upperInStr.length(); i++) {
            if (!(Character.isDigit(upperInStr.charAt(i)) || ((upperInStr.charAt(i) >= 65) && (upperInStr.charAt(i) <= 70)))) {
                System.out.println(inStr + " is NOT a hex string");
                return;
            }
        }
        System.out.println(inStr + " is a hex string");
    }
}
