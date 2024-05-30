package hus.oop.homework2.exercisesonarray;
import java.util.Scanner;
public class PrintArrayInStars {
    public static void main(String[] args) {
        printArrayInStars(inputItems());
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

    public static void printArrayInStars(int[] items){
        for(int i = 0; i < items.length; i++){
            System.out.print(i + ": ");
            for(int j = 0; j < items[i]; j++){
                System.out.print("*");
            }
            System.out.print ("("+items[i]+")");
            System.out.println();
        }
    }
}
