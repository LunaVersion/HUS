package hus.oop.lap2;
import java.util.Scanner;
public class CopyOf {
    public static void main(String[] args) {
        int[] arr1 = inputArr();
        System.out.println(copyOf(arr1));
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
    public static int[] copyOf(int[] array) {
        int[] copyArr = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            copyArr[i] = array[i];
        }
        return copyArr;
    }
}
