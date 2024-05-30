package thietkevadanhgiathuattoan.Hw6_21000684_LeThiHuong;

import java.util.ArrayList;
import java.util.List;

public class LongestIncreasingSubsequence {
    public static List<Integer> longestIncreasingSubsequence(int[] a, int n) {
        int[] dp = new int[n];
        int max_length = 1;
        int end_index = 0;

        for (int i = 0; i < n; i++) {
            dp[i] = 1; // dãy có 1 ptu

            for (int j = 0; j < i; j++) {
                if (a[i] > a[j] && dp[i] < dp[j] + 1) {
                    dp[i] = dp[j] + 1;
                }
            }

            if (max_length < dp[i]) {
                max_length = dp[i];
                end_index = i;
            }
        }

        List<Integer> longestSubsequence = new ArrayList<>();
        longestSubsequence.add(a[end_index]); // Thêm phần tử cuối cùng vào dãy

        // Thuật toán truy vết
        for (int i = end_index - 1; i >= 0; i--) {
            if (a[i] < a[end_index] && dp[i] == dp[end_index] - 1) {
                longestSubsequence.add(a[i]);
                end_index = i;
            }
        }

        List<Integer> result = new ArrayList<>();
        for (int i = longestSubsequence.size() - 1; i >= 0; i--) {
            result.add(longestSubsequence.get(i));
        }

        return result;
    }

    public static void main(String[] args) {
        int[] a = {10, 22, 9, 33, 21, 50, 41, 60};
        int n = a.length;
        List<Integer> subsequence = longestIncreasingSubsequence(a, n);
        System.out.println(subsequence);
    }
}


