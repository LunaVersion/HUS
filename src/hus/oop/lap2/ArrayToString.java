package hus.oop.lap2;

import java.util.Scanner;
public class ArrayToString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int size;
        int [] array;

        System.out.print("Enter array's size: ");
        size = sc.nextInt();
        array = new int[size];
        System.out.print("Enter the elements of array (separated by space): ");

        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        sc.close();

        System.out.println("Array: " + arrayToString(array));
    }

    public static String arrayToString(int[] array) {
        String arr = "";
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                arr += "[" +array[i];
            } else {
                arr += ", " + array[i];
            }
        }
        arr += "]";
        return arr;
    }

}
