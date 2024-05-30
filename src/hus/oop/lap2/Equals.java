package hus.oop.lap2;

import java.util.Scanner;

public class Equals {
    public static void main(String[] args) {
        int[] arr1 = inputArr();
        int[] arr2 = inputArr();
        System.out.println(equals(arr1, arr2));
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

    public static boolean equals(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == arr2.length) return true;
        }
        return false;
    }

}
