package hus.oop.lab4_old;

import java.util.Scanner;

public class RecursiveBinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        int array[] = new int[size];
        System.out.println("Enter the index: ");
        for(int i = 0; i < size; i++){
            array[i] = sc.nextInt();
        }
        System.out.println("Enter the key that you wanna find: ");
        int key = sc.nextInt();
        System.out.println("Enter the start index: ");
        int fromIdx = sc.nextInt();
        System.out.println("Enter the begin index: ");
        int toIdx = sc.nextInt();

        System.out.println(binarySearch(array, key, fromIdx, toIdx));
        System.out.println(binarySearch(array, key));
    }

    public static boolean binarySearch(int[] array, int key, int fromIdx, int toIdx) {

        if (fromIdx == toIdx - 1) {
            if (key == array[fromIdx]) {
                return true;
            } else {
                return false;
            }
        } else {
            int middleIdx = (fromIdx + toIdx) / 2;
            if (key == array[middleIdx]) {
                return true;
            } else if (key < array[middleIdx]) {
                toIdx = middleIdx;
            }
            int firstIdx = middleIdx + 1;
            return binarySearch(array, key, fromIdx, toIdx);

        }
    }
    public static boolean binarySearch(int[] array, int key){
        for(int i =1; i<array.length; i++){
            if(array[i]==key){
                return true;
            }
        }
        return false;
    }
}
