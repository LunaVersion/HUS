package hus.oop.lab1;

import java.util.Scanner;

public class SumAverageRunningInt {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose the number: ");
        System.out.println("0. Using -for-");
        System.out.println("1. Using -while-do-");
        System.out.println("2. Using -do-while-");
        System.out.println("3. Sum of old and sum of even from 1 to 100.");
        System.out.println();
        int choose = scanner.nextInt();
        switch (choose) {
            case 0:
                int sum = 0;
                double average;
                int LOWERBOUND = 1;
                int UPPERBOUND = 100;
                for (int number = LOWERBOUND; number <= UPPERBOUND; ++number) {
                    sum += number;
                }
            System.out.println("The sum of 1 to 100 is " + sum);
            System.out.println("The average is " + sum / 100.0);
            break;
            case 1:
                int sum1 = 0;
                System.out.print("Enter the LOWERBOUND: ");
                int LOWERBOUND1 = scanner.nextInt();
                int number1 = LOWERBOUND1;
                System.out.print("Enter the UPPERBOUND: ");
                int UPPERBOUND1 = scanner.nextInt();
                while(number1 <= UPPERBOUND1){
                    sum1 += number1;
                    ++number1;
                }
                System.out.println("The sum of 1 to 100 is " + sum1);
                System.out.println("The average is " + sum1 / 100.0);
                break;
            case 2:
                int sum2 = 0;
                System.out.print("Enter the LOWERBOUND: ");
                int LOWERBOUND2 = scanner.nextInt();
                int number2 = LOWERBOUND2;
                System.out.print("Enter the UPPERBOUND: ");
                int UPPERBOUND2 = scanner.nextInt();
                do {
                    sum2 += number2;
                    ++number2;
                } while (number2 <= UPPERBOUND2);
                break;
            case 3:
                int sumOld = 0;
                int sumEven = 0;
                int absDiff;
                for (int i = 1; i <= 100; i++) {
                    if(i%2 != 0){
                        sumOld += i;
                    }else{
                        sumEven += i;
                    }
                }
                if(sumOld > sumEven){
                    absDiff = sumOld - sumEven;
                }else{
                    absDiff = sumEven - sumOld;
                }
                System.out.println("Sum of old: " + sumOld);
                System.out.println("Sum of even: " + sumEven);
                System.out.println("Their absolute different: " + absDiff);
        }
    }
}
