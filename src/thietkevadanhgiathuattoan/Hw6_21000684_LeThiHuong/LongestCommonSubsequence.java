package thietkevadanhgiathuattoan.Hw6_21000684_LeThiHuong;

/*
Khởi tạo một bảng dp có kích thước (m+1) x (n+1) để lưu độ dài của xâu con chung tại mỗi bước.
Duyệt qua các ký tự của xâu X và Y:
Nếu ký tự tại vị trí i của X giống ký tự tại vị trí j của Y, thì dp[i][j] = dp[i-1][j-1] + 1.
Ngược lại, dp[i][j] được cập nhật bằng giá trị lớn nhất giữa dp[i-1][j] và dp[i][j-1].
Kết quả cuối cùng là giá trị tại ô dp[m][n].
 */

public class LongestCommonSubsequence {
    public static int longestCommonSubsequence(String X, String Y) {
        int m = X.length();
        int n = Y.length();
        int[][] dp = new int[m + 1][n + 1];

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (X.charAt(i - 1) == Y.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        return dp[m][n];
    }

    public static void main(String[] args) {
        String X = "ABCDGH";
        String Y = "AEDFHR";
        int length = longestCommonSubsequence(X, Y);
        System.out.println("Length of the longest common subsequence: " + length);
    }
}

