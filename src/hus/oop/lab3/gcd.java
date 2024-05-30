package hus.oop.lab3;

import java.util.Scanner;

public class gcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("gcd(" + a +", " + b +") = " + gcd(a,b));
    }
    public static int gcd(int a, int b){
        if(b==0) return a;
        return gcd(a, b%a);
    }
}
