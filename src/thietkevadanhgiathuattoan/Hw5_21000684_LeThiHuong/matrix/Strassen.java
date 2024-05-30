package thietkevadanhgiathuattoan.Hw5_21000684_LeThiHuong.matrix;

public class Strassen {
    public static int strassen(int A, int B, int n) {
        if (n == 1) return A * B;
        return strassen(A, B, n / 2);
    }

    public static int[][] STRASSEN(int[][] A, int[][] B, int n) {
        int[][] C = new int[n][n];
        if (n == 1) {
            C[0][0] = A[0][0] * B[0][0];
            return C;
        } else {
            int P1 = strassen(A[0][0], B[0][1] - B[1][1], n / 2);
            int P2 = strassen(A[0][0] + A[0][1], B[1][1], n / 2);
            int P3 = strassen(A[1][0] + A[1][1], B[0][0], n / 2);
            int P4 = strassen(A[1][1], B[1][0] - B[0][0], n / 2);
            int P5 = strassen(A[0][0] + A[1][1], B[0][0] + B[1][1], n / 2);
            int P6 = strassen(A[0][1] - A[1][1], B[1][0] + B[1][1], n / 2);
            int P7 = strassen(A[0][0] - A[1][0], B[0][0] + B[0][1], n / 2);
            C[0][0] = P5 + P4 - P2 + P6;
            C[0][1] = P1 + P2;
            C[1][0] = P4 + P3;
            C[1][1] = P1 + P5 - P3 - P7;
            return C;
        }
    }

    public static void main(String[] args) {
        int[][] A = new int[][]{
                {1, 4},
                {3, 6}
        };
        int[][] B = new int[][]{
                {5, 6},
                {2, 3}
        };
        int[][] C = STRASSEN(A, B, 2);
        for (int i = 0; i <= 1; i++) {
            for (int j = 0; j <= 1; j++) {
                System.out.println("C[" + i + "][" + j + "] = " + C[i][j]);
            }
        }
    }
}
