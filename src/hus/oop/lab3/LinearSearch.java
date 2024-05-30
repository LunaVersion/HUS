package hus.oop.lab3;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the number of index " + i + ": ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the key for check: ");
        int key = sc.nextInt();

        // check
        if(linearSearch(arr,key)) {
            System.out.println("The key is found inside the array.");
            System.out.println("The key is founded at index: " + linearSearchIndex(arr,key));
        }
    }

    public static boolean linearSearch(int[] array, int key){
        for (int i = 0; i < array.length; i++) {
            if(array[i] == key) return true;
        }
        return false;
    }

    public static int linearSearchIndex(int[] array, int key){
        for (int i = 0; i < array.length; i++) {
            if(array[i] == key) return i;
        }
        return 0;
    }
}
