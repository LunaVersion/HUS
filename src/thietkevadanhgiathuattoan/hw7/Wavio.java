package thietkevadanhgiathuattoan.hw7;

public class Wavio {
    public static int longestWavioSequence(int[] arr) {
        int n = arr.length;
        int[] lis = new int[n];
        int[] lds = new int[n];

        // Tính LIS
        for (int i = 0; i < n; i++) {
            lis[i] = 1;
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j]) {
                    lis[i] = Math.max(lis[i], lis[j] + 1);
                }
            }
        }

        // Tính LDS
        for (int i = n - 1; i >= 0; i--) {
            lds[i] = 1;
            for (int j = n - 1; j > i; j--) {
                if (arr[i] > arr[j]) {
                    lds[i] = Math.max(lds[i], lds[j] + 1);
                }
            }
        }

        int maxWavioLength = 0;
        for (int i = 0; i < n; i++) {
            maxWavioLength = Math.max(maxWavioLength, lis[i] + lds[i] - 1);
        }

        return maxWavioLength;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 2, 1};
        System.out.println("Length of the longest Wavio sequence: " + longestWavioSequence(arr)); // Output: 7
    }
}
