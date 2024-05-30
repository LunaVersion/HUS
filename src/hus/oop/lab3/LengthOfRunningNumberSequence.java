package hus.oop.lab3;

import java.util.Scanner;

public class LengthOfRunningNumberSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the input: ");
        int number = sc.nextInt();
//        System.out.println("S(" + number + ") = " + s(number));
        System.out.println("len(" + number + ") = " + len(number));
    }
    public static int len(int n){
        if(n==1) return 1;
        return len(n-1) + numOfDigits(n);
    }
    public static int numOfDigits(int n){
        String nextStr = Integer.toString(n);
        return nextStr.length();
    }
//    public static int s(int n){
//        if(n==1) return 1;
//        return s(n-1) * 10^lengthOfInput(n) + n;
//    }
//    public static int lengthOfInput(int n){
//        String str = Integer.toString(n);
//        return str.length();
//    }
}
