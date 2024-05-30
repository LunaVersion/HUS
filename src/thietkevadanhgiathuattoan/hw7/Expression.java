package thietkevadanhgiathuattoan.hw7;

public class Expression {
    public static int maxProductPartition(int[] nums) {
        int n = nums.length;
        int totalSum = 0;

        for (int num : nums) {
            totalSum += num;
        }


        int halfSum = totalSum / 2;

        boolean[][] dp = new boolean[n + 1][halfSum + 1];

        // chia được tổng 0 với bất kỳ tập hợp nào bằng cách không chọn phần tử nào
        for (int i = 0; i <= n; i++) {
            dp[i][0] = true;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= halfSum; j++) {
                if (j >= nums[i - 1]) {
                    dp[i][j] = dp[i - 1][j] || dp[i - 1][j - nums[i - 1]];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        int sum1 = 0;
        for (int j = halfSum; j >= 0; j--) {
            if (dp[n][j]) {
                sum1 = j;
                break;
            }
        }

        int sum2 = totalSum - sum1;

        return sum1 * sum2;
    }

    public static void main(String[] args) {
        int[] nums = {4,6,2,4,7,9,4,2,2,56,3};
        System.out.println(maxProductPartition(nums));
    }
}
