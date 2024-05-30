package hus.oop.lab3;

import java.util.Scanner;

public class RecursiveBinarySearch {
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
        System.out.print("Enter the index from: ");
        int fromIdx = sc.nextInt();
        System.out.print("Enter the index to: ");
        int toIdx = sc.nextInt();
        binarySearch(arr,key,fromIdx,toIdx);
    }

    public static boolean binarySearch(int[] array, int key, int fromIdx, int toIdx){
        int middleIdx = (fromIdx + toIdx) / 2;
        if(fromIdx == toIdx-1) {
            if (key == array[fromIdx]) return true;
            return false;
        }else {
            if(key == array[middleIdx]) return true;
            else if(key < array[middleIdx]) toIdx = middleIdx;
            else fromIdx = middleIdx + 1;
            binarySearch(array,key,fromIdx,toIdx);
        }
        return false;
    }
}
