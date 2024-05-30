package hus.oop.lab3;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the number of index " + i + ": ");
            arr[i] = sc.nextInt();
        }
        bubbleSort(arr);
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void bubbleSort(int[] array){
        int length = array.length;
        boolean swapped;
        do{
            swapped = false;
            for (int i = 1; i < array.length; i++) {
                if(array[i-1] > array[i]){
                    int temp = array[i];
                    array[i] = array[i-1];
                    array[i-1] = temp;
                    swapped = true;
                }
            }
            length = length - 1;
        }while (swapped);
    }
}
