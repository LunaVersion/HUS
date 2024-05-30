package thietkevadanhgiathuattoan.hw3;

/*
Bài toán: Cho số nguyên dương n < 100, tìm 1 xâu gồm toàn các kí tự A, B, C
    thoả mãn: Xâu có độ dài n, 2 đoạn con bất kì liền nhau đều khác nhau, xâu có ít kí tự C
    nhất.
Phân tích bài toán:
  - input: độ dài của xâu
  - output: in ra xâu hợp lệ
Xây dựng thuật toán
  - Backtracking:
    + Liệt kê và kiểm tra xem xâu đó có thỏa mãn không
  - Branch and bound
    +
 */

public class ABC {
    static String bestResult = null;
    static int minCCount = Integer.MAX_VALUE;

    public static void main(String[] args) {
        int n = 5; // Bạn có thể thay đổi giá trị của n ở đây
        String result = findBestString(n);
        System.out.println("Xâu tìm được: " + result);
    }

    static boolean isValid(String string) {
        // Kiểm tra xem xâu có chứa 2 đoạn con C liền nhau hay không
        return !string.contains("CC");
    }

    static int evaluate(String string) {
        // Đánh giá số lượng kí tự C trong xâu
        int count = 0;
        for (char c : string.toCharArray()) {
            if (c == 'C') {
                count++;
            }
        }
        return count;
    }

    static void backtrack(String string, int n) {
        if (string.length() == n) {
            if (isValid(string)) {
                int cCount = evaluate(string);
                if (cCount < minCCount) {
                    bestResult = string;
                    minCCount = cCount;
                }
            }
            return;
        }

        for (char ch : new char[] {'A', 'B', 'C'}) {
            String newString = string + ch;
            if (isValid(newString)) {
                backtrack(newString, n);
            }
        }
    }

    static String findBestString(int n) {
        backtrack("", n);
        return bestResult;
    }
}
