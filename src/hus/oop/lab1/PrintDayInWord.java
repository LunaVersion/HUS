package hus.oop.lab1;

import java.util.Scanner;

public class PrintDayInWord {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int choose = scanner.nextInt();
        int day = scanner.nextInt();
        switch(choose) {
            case 1:  // if else
                if (day == 0) {
                    System.out.println("SUNDAY");
                }else if(day == 1){
                    System.out.println("MONDAY");
                }else if(day == 2){
                    System.out.println("TUESDAY");
                }else if(day == 3){
                    System.out.println("THURSDAY");
                }else if(day == 4){
                    System.out.println("WEDNESDAY");
                }else if(day == 5){
                    System.out.println("FRIDAY");
                }else if(day == 6) {
                    System.out.println("SATURDAY");
                }else{
                    System.out.println("NO");
                }
            break;
            case 2:
                // switch case
                switch (choose) {
                    case 0:
                        System.out.println("SUNDAY");
                        break;
                    case 1:
                        System.out.println("MONDAY");
                        break;
                    case 2:
                        System.out.println("TUESDAY");
                        break;
                    case 3:
                        System.out.println("THURSDAY");
                        break;
                    case 4:
                        System.out.println("WEDNESDAY");
                        break;
                    case 5:
                        System.out.println("FRIDAY");
                        break;
                    case 6:
                        System.out.println("SATURDAY");
                        break;
                    default: System.out.println("NO");
                }
        }
    }
}

