package hus.oop.lab3;

import java.util.Scanner;

public class FactorialRecusive {
    public static int factorial(int n){
        if(n==0) return 1;
        return n * factorial(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the input: ");
        int number = sc.nextInt();
        System.out.println("Factorial(" +number+") is " + factorial(number));
    }
}
