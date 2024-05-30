package hus.oop.lab4;

import java.util.Scanner;

public class PrintArray {
    public static void main(String[] args) {
        printArray(inputItems());
    }

    public static Scanner sc = new Scanner(System.in);

    public static int[] inputItems(){
        System.out.print("Enter the number of items: ");
        final int NUM_ITEMS = sc.nextInt();
        int[] items = new int[NUM_ITEMS];
        if (items.length > 0) {
            for(int i = 0; i < items.length; i++){
                items[i] = sc.nextInt();
            }
        }
        return items;
    }

    public static void printArray(int[] items){
        System.out.print("The values are: ");
        for(int i = 0; i < items.length; i++){
            if(i==0){
                System.out.print("[" + items[i]);
            }else{
                System.out.print("," + items[i] );
            }
        }
        System.out.print( "]" );
    }
}
