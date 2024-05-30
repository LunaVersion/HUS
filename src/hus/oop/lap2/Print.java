package hus.oop.lap2;
import java.util.Scanner;
public class Print {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array's size: ");
        int size = sc.nextInt();

        int[] array = new int[size];
        // double[] array = new double[size];
        // float[] array = new float[size];

        for (int i = 0; i < size; i++) {
            System.out.printf("Enter number at %d: ",i);
            array[i] = sc.nextInt();
            // array[i] = sc.nextDouble();
            // array[i] = sc.nextFloat();
        }
        print(array);

        sc.close();
    }
    public static void print(int[] array) { // float[] array, double[] array
        System.out.print("Array: ");
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                System.out.printf("[%d", array[i]);
            } else {
                System.out.printf(", %d", array[i]);
            }
        }
        System.out.println("]");
    }
}
