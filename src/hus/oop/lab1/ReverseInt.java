package hus.oop.lab1;

import java.util.Scanner;

public class ReverseInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive interger: ");
        int number = sc.nextInt();
        int inDigit;
        System.out.println("The reverse is: ");
        while(number > 0){
            inDigit = number % 10;
            System.out.print(inDigit);
            number /= 10;
        }
    }
}
