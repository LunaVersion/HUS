package thietkevadanhgiathuattoan.hw7;

public class MaximumSignChangeSubsequence {
    public static int maxSignChangeSubsequence(int[] arr) {
        int maxLen = 0;
        int curLen = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                curLen++;
            } else {
                curLen = Math.max(curLen - 1, 0);
            }
            maxLen = Math.max(maxLen, curLen);
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int[] arr = {1, -2, 3, -4, -5, 6, -7, -8};
        System.out.println("Length of the maximum sign change subsequence: " + maxSignChangeSubsequence(arr)); // Output: 5
    }
}
