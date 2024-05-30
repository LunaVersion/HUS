package hus.oop.lab4_old;
import java.util.Scanner;
public class LengthOfARunningNumberSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();
        System.out.println("S(" + number + ") = " + len(number) );
    }


    public static int len(int n){
        if(n==1){
            return 1;
        }
        return len(n-1) + numOfDigits(n);
    }

    public static int numOfDigits(int n){
        String nextStr = Integer.toString(n);
        return nextStr.length();
    }
}
