package hus.oop.lap2;
import java.util.Scanner;
public class Search {
    public static void main(String[] args) {
        System.out.print("Enter key: ");
        int key = sc.nextInt();
        System.out.println(search(inputArr(), key));
    }

    public static Scanner sc = new Scanner(System.in);

    public static int[] inputArr() {
        System.out.print("Enter size of array: ");
        int[] array = new int[sc.nextInt()];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter number at " + i + ": ");
            array[i] = sc.nextInt();
        }
        return array;
    }
    public static int search(int[] arr, int key) {
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] == key) return i;
        }
        return -1;
    }
}
