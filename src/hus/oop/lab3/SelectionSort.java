package hus.oop.lab3;

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        int array[] = new int[size];
        System.out.println("Enter the index: ");
        for(int i = 0; i < size; i++){
            array[i] = sc.nextInt();
        }
        printArraySelectionSort(array);
    }
    public static void selectionSort(int array[]){
        for(int i = 0; i < array.length - 1; i++){
            int minIdx = i;
            for (int j = i + 1; j < array.length; j++){
                if (array[j] < array[minIdx]){
                    minIdx = j;
                }
            }
            int temp = array[minIdx];
            array[minIdx] = array[i];
            array[i] = temp;
        }
    }
    public static void printArraySelectionSort(int[] array){
        selectionSort(array);
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i]+ " ");
        }
        System.out.println();
    }
}
