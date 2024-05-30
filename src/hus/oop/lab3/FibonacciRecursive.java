package hus.oop.lab3;

import java.util.Scanner;

public class FibonacciRecursive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the input: ");
        int number = sc.nextInt();
        System.out.println("F("+number+") = " + fibonacci(number));
    }
    public static int fibonacci(int n){
        if(n==0 || n==1){
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
