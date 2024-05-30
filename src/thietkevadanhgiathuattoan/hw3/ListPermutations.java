package thietkevadanhgiathuattoan.hw3;

import java.util.Arrays;

/*
Bài toán: Liệt kê các hoán vị của n phần tử
Phân tích bài toán:
  - input: số nguyên dương n
  - output: các hoán vị của n phần tử
Xây dựng thuật toán
  - Backtracking:
    + Dùng đệ quy thử từng phần tử đặt ở vị trí kế tiếp của dãy đang xét
    + Mỗi lần đặt 1 phần tử mới vào vị trí, kiểm tra xem đã được dùng trước đó chưa,
      nếu chưa thì đặt vào, nếu được dùng rồi thì bỏ qua
    + In ra hoán vị đó khi hoàn thành
  - Branch and bound
    + Sử dụng 1 hàm ước lượng để ước lượng số phần tử còn lại phải sắp xếp
      Ước lượng dưới: đếm số lượng phần tử còn lại phải sắp xếp trong một hoán vị.
      Nếu ước lượng dưới của một nhánh >= số lượng phần tử đã sắp xếp tốt nhất hiện tại,
      loại bỏ nhánh đó.
*/

public class ListPermutations {
    public static void main(String[] args) {
        System.out.println("Backtracking: ");
        int n = 4;
        int[] permutation = new int[n];
        boolean[] used = new boolean[n];
        Backtracking(permutation, used, 0);
        System.out.println("Branch and bound: ");
        int[] BbPermutation = new int[n];

        branchAndBound(0, n, used, BbPermutation, 0);

        System.out.println("Best permutation: " + Arrays.toString(bestPermutation));
        System.out.println("Cost: " + bestCost);

    }

    public static void Backtracking(int[] permutation, boolean[] used, int index) {
        if (index == permutation.length) {
            printArray(permutation);
            return;
        }
        for (int i = 0; i < permutation.length; i++) {
            if (!used[i]) {
                permutation[index] = i + 1;
                used[i] = true;
                Backtracking(permutation, used, index + 1);
                used[i] = false;
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    private static int[] bestPermutation;
    private static int bestCost = Integer.MAX_VALUE;

    public static void branchAndBound(int level, int n, boolean[] used, int[] currentPermutation, int cost) {
        if (level == n) {
            System.out.println(Arrays.toString(currentPermutation));
            return;
        }

        for (int i = 1; i <= n; i++) {
            if (!used[i-1]) {
                used[i-1] = true;
                currentPermutation[level] = i;
                int newCost = cost + (level == 0 ? 0 : Math.abs(currentPermutation[level] - currentPermutation[level - 1]));

                // Pruning using lower bound
                if (newCost < bestCost) {
                    branchAndBound(level + 1, n, used, currentPermutation, newCost);
                }

                used[i-1] = false;
            }
        }
    }
}
