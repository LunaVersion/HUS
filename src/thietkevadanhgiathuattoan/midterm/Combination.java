package thietkevadanhgiathuattoan.midterm;

import java.util.Scanner;

public class Combination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        System.out.println("Enter the numbers in array: ");
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("k = ");
        int k = sc.nextInt();
        int[] x = new int[k + 1];

        combination(1, arr, k, x);
    }

    public static void combination(int i, int[] arr, int k, int[] x) {
        for (int j = 1; j <= arr.length; j++) {
            if (x[i - 1] + 1 <= j & j <= arr.length - k + i) {
                x[i] = j;
                if (i < k) {
                    combination(i + 1, arr, k, x);
                } else {
                    for (int m = 1; m <= k; m++) {
                        System.out.print(arr[x[m] - 1] + " ");
                    }
                    System.out.println();
                }
            }
        }
    }
}
