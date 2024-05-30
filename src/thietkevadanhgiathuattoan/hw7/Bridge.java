package thietkevadanhgiathuattoan.hw7;

import java.util.Arrays;

public class Bridge {

    static class Connection implements Comparable<Connection> {
        int alpha;
        int beta;

        Connection(int alpha, int beta) {
            this.alpha = alpha;
            this.beta = beta;
        }

        @Override
        public int compareTo(Connection o) {
            return this.alpha - o.alpha;
        }
    }

    public static int longestIncreasingSubsequence(Connection[] connections) {
        int n = connections.length;
        int[] dp = new int[n];
        Arrays.fill(dp, 1);

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (connections[i].beta > connections[j].beta) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }

        int maxLIS = 0;
        for (int length : dp) {
            maxLIS = Math.max(maxLIS, length);
        }
        return maxLIS;
    }

    public static int maxBridges(int[] alpha, int[] beta) {
        int n = Math.min(alpha.length,beta.length);
        Connection[] connections = new Connection[n];

        for (int i = 0; i < n; i++) {
            connections[i] = new Connection(alpha[i], beta[i]);
        }

        Arrays.sort(connections);

        return longestIncreasingSubsequence(connections);
    }

    public static void main(String[] args) {
        int[] alpha = {4, 8, 3, 2, 8};
        int[] beta = {4, 1, 2, 3, 9,5,7,4,3};

        System.out.println(maxBridges(alpha, beta));
    }
}
