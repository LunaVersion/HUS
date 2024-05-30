package thietkevadanhgiathuattoan.Hw5_21000684_LeThiHuong.matrix;

public class MatrixMultiplication {
    public static int matrixMultiplication(int a, int b, int n){
        if(n==1) return a * b;
        return matrixMultiplication(a,b,n/2);
    }
    public static int[][] MATRIXMULTIPLICATION(int[][] A, int[][] B, int n){
        int[][] C = new int[n][n];
        if(n == 1){
            C[0][0] = A[0][0] * B[0][0];
            return C;
        }
        else {
            int X1 = matrixMultiplication(A[0][0],B[0][0],n/2);
            int X2 = matrixMultiplication(A[0][1],B[1][0],n/2);
            int X3 = matrixMultiplication(A[0][0],B[0][1],n/2);
            int X4 = matrixMultiplication(A[0][1],B[1][1],n/2);
            int X5 = matrixMultiplication(A[1][0],B[0][0],n/2);
            int X6 = matrixMultiplication(A[1][1],B[1][0],n/2);
            int X7 = matrixMultiplication(A[1][0],B[0][1],n/2);
            int X8 = matrixMultiplication(A[1][1],B[1][1],n/2);
            C[0][0] = X1+X2;
            C[0][1] = X3+X4;
            C[1][0] = X5+X6;
            C[1][1] = X7+X8;
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
        int[][] C = MATRIXMULTIPLICATION(A, B, 2);
        for (int i = 0; i <= 1; i++) {
            for (int j = 0; j <= 1; j++) {
                System.out.println("C[" + i + "][" + j + "] = " + C[i][j]);
            }
        }
    }
}
