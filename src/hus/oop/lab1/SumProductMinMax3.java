package hus.oop.lab1;

import java.util.Scanner;

public class SumProductMinMax3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number 1: ");
        int number1 = sc.nextInt();
        System.out.println("Enter the number 2: ");
        int number2 = sc.nextInt();
        System.out.println("Enter the number 3: ");
        int number3 = sc.nextInt();
        sc.close();
        int sum ;
        int product;
        int min;
        int max;

        //Compute sum and product
        sum = number1 + number2 + number3;
        product = number1 * number2 * number3;

        // Compute min
        min = number1;
        if(number2 < min) min = number2;
        if(number3 < min) min = number3;
        // Compute max
        max = number1;
        if(number2 > max) max = number2;
        if(number3 > max) max = number3;

        // result
        System.out.println("The result:");
        System.out.println("The sum is: " + sum);
        System.out.println("The product is: " + product);
        System.out.println("The min is: " + min);
        System.out.println("The max is: " + max);
    }
}
