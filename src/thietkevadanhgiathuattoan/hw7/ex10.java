package thietkevadanhgiathuattoan.hw7;

import java.util.Arrays;

public class ex10 {
    public static boolean canFormExpression(int[] nums, int S) {
        int n = nums.length;
        int sum = Arrays.stream(nums).sum();

        if (Math.abs(S) > sum) {
            return false;
        }

        // Offset để xử lý giá trị âm
        int offset = sum;
        int maxSum = 2 * sum + 1;

        boolean[][] dp = new boolean[n + 1][maxSum];
        dp[0][offset] = true;

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < maxSum; j++) {
                if (dp[i - 1][j]) {
                    if (j + nums[i - 1] < maxSum) {
                        dp[i][j + nums[i - 1]] = true;
                    }
                    if (j - nums[i - 1] >= 0) {
                        dp[i][j - nums[i - 1]] = true;
                    }
                }
            }
        }

        return dp[n][S + offset];
    }

    public static void main(String[] args) {
        int[] n = {3,5,7,8,5,2,4,6,7,4,3,135};
        int S = 189;
        if (canFormExpression(n, S)) {
            System.out.println("Có thể thay các dấu '?' để đạt được tổng là " + S);
        } else {
            System.out.println("Không thể thay các dấu '?' để đạt được tổng là " + S);
        }
    }
}
