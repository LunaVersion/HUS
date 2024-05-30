package hus.oop.lab4_old;
import java.util.Scanner;
public class PerfectAndDeficientNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Positive Integer: ");
        int aPosInt = sc.nextInt();
        System.out.println("This number is Perfect: " +isPerfect(aPosInt));
        System.out.println("This number is Deficient: " + isDeficient(aPosInt));

        sc.close();
    }

    public static boolean isPerfect(int aPosInt) {
        int sum = 0;
        for (int i = 1; i <= aPosInt/2; i++) {
            if ((aPosInt % i) == 0) {
                sum += i;
            }
        }
        if (sum == aPosInt) return true;
        return false;
    }

    public static boolean isDeficient(int aPosInt) {
        int sum = 0;
        for (int i = 1; i <= aPosInt/2; i++) {
            if ((aPosInt % i) == 0) {
                sum += i;
            }
        }
        if (sum < aPosInt) return true;
        return false;
    }

}
