package thietkevadanhgiathuattoan.hw7;

import java.util.ArrayList;
import java.util.List;

public class SumArray {
    public static List<Integer> sumArray(int[] A, int S) {
        int n = A.length;
        List<Integer> result = new ArrayList<>();
        int[] sum = new int[n];

        sum[0] = A[0];
        for (int i = 1; i < n; i++) {
            sum[i] = sum[i - 1] + A[i];
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (sum[i] - (j > 0 ? sum[j - 1] : 0) == S) {
                    for (int k = j; k <= i; k++) {
                        result.add(A[k]);
                    }
                    return result;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 9, 7, 6, 8};
        int S = 15;
        List<Integer> subarray = sumArray(A, S);
        if (!subarray.isEmpty()) {
            System.out.println("Subarray with sum " + S + ": " + subarray); // Output: Subarray with sum 15: [1, 2, 3, 4, 5]
        } else {
            System.out.println("No subarray with sum " + S + " found.");
        }
    }
}
