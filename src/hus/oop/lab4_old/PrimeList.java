package hus.oop.lab4_old;
import java.util.Scanner;
import java.text.DecimalFormat;
public class PrimeList {
    public static DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the upper bound: ");
    int upperNum = sc.nextInt();

    sc.close();
    int counter = 0;

    for (int i = 1; i < upperNum; i++) {
        if (isPrime(i)) {
            System.out.println(i);
            counter++;
        }
    }

        System.out.printf("[%d primes found " + df.format(((double) counter / upperNum) * 100)  + "%%]", counter);
}


    public static boolean isPrime(int intNum) {
        if (intNum == 1) return true;
        int counter = 0;
        for (int i = 1; i <= intNum; i++) {
            if ((intNum % i) == 0) {
                counter++;
            }
        }
        if (counter == 2) return true;
        return false;

    }

}
