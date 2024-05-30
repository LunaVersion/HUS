package thietkevadanhgiathuattoan.hw7;
import java.util.Arrays;

public class Candy {
    public static int[][] distributeCandies(int[] candies) {
        Arrays.sort(candies);

        int sum1 = 0, sum2 = 0;
        int[] partition1, partition2;

        for (int i = candies.length - 1; i >= 0; i--) {
            if (sum1 <= sum2) {
                sum1 += candies[i];
            } else {
                sum2 += candies[i];
            }
        }

        partition1 = new int[(candies.length + 1) / 2];
        partition2 = new int[candies.length / 2];
        int index1 = 0, index2 = 0;

        for (int i = candies.length - 1; i >= 0; i--) {
            if (sum1 <= sum2) {
                partition1[index1++] = candies[i];
                sum1 -= candies[i];
            } else {
                partition2[index2++] = candies[i];
                sum2 -= candies[i];
            }
        }

        return new int[][] { partition1, partition2 };
    }

    public static void main(String[] args) {
        int[] candies = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[][] partitions = distributeCandies(candies);

        System.out.println("Partition 1: " + Arrays.toString(partitions[0]));
        System.out.println("Partition 2: " + Arrays.toString(partitions[1]));
    }
}
