package hus.oop.lab1;

import java.util.Scanner;

public class InputValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isValid = false;
        do{
            System.out.print("Enter a number between 0-10 or 90-100: ");
            int number = sc.nextInt();
            if(0 <= number && number <= 10 || 90 <= number && number <= 100){
                isValid = true;
                System.out.println("You have entered: " + number);
            }else{
                System.out.println("Invalid input, try again...");
            }
        }while(!isValid);
    }
}
