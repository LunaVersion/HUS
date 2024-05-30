package hus.oop.lap2;

import java.util.Scanner;

public class Contains {
    public static void main(String[] args) {
        System.out.print("Enter key: ");
        int key = sc.nextInt();
        System.out.println(contains(inputArr(), key));
    }

    public static Scanner sc = new Scanner(System.in);

    public static int[] inputArr() {
        System.out.print("Enter size of array: ");
        int[] arr = new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter number at " + i + ": ");
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    public static boolean contains(int[] array, int key) {
        for(int i = 0; i < array.length; i++) {
            if (array[i] == key) return true;
        }
        return false;
    }
}
