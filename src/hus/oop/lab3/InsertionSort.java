package hus.oop.lab3;

import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        int array[] = new int[size];
        System.out.println("Enter the index: ");
        for(int i = 0; i < size; i++){
            array[i] = sc.nextInt();
        }
        printArray(array);
    }
    public static void insertionSort(int[] arr){
        int length = arr.length;
        for (int i = 1; i < length; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
    public static void printArray(int[] arr) {
        insertionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
