package hus.oop.lap2;
import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        int[] arr1 = inputArr();
        reverse(arr1);
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

    public static void reverse(int[] arr) {
        int[] reversedArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversedArr[i] = arr[arr.length - i - 1];
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = reversedArr[i];
        }
    }
}
