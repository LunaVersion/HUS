package thietkevadanhgiathuattoan.Hw6_21000684_LeThiHuong;

public class Combination {
    public static int combination(int n, int k) {
        int[][] dp = new int[n + 1][k + 1];

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= Math.min(i, k); j++) {
                if (j == 0 || j == i) {
                    dp[i][j] = 1;
                } else {
                    dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
                }
            }
        }

        return dp[n][k];
    }

    public static void main(String[] args) {
        int n = 5;
        int k = 3;
        int result = combination(n, k);
        System.out.println("Combination of " + n + " choose " + k + " is: " + result);
    }
}

