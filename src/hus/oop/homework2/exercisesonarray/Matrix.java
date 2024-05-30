package hus.oop.homework2.exercisesonarray;

public class Matrix {

    public static void main(String[] args) {
        int[][] matrix1 = {{1, 2}, {3, 4}};
        int[][] matrix2 = {{5, 6}, {7, 8}};

        System.out.println("Matrix 1: ");
        print(matrix1);
        System.out.println("Matrix 2: ");
        print(matrix2);

        // Test phương thức add
        System.out.println("Addition Test:");
        print(add(matrix1, matrix2)); // Kết quả: {{6, 8}, {10, 12}}

        // Test phương thức subtract
        System.out.println("\nSubtraction Test:");
        print(subtract(matrix1, matrix2)); // Kết quả: {{-4, -4}, {-4, -4}}

        // Test phương thức multiply
        System.out.println("\nMultiplication Test:");
        print(multiply(matrix1, matrix2));
    }

    public static void print(int[][] matrix){
        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void print(double[][] matrix){
        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean haveSameDimension(int[][] matrix1, int[][] matrix2){
        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int rows2 = matrix2.length;
        int cols2 = matrix2[0].length;

        return (rows1 == rows2 && cols1 == cols2);
    }
    public static boolean haveSameDimension(double[][] matrix1, double[][] matrix2){
        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int rows2 = matrix2.length;
        int cols2 = matrix2[0].length;

        return (rows1 == rows2 && cols1 == cols2);
    }

    public static int[][] add(int[][] matrix1, int[][] matrix2){
        if (!haveSameDimension(matrix1, matrix2)) {
            return null;
        }

        int rows = matrix1.length;
        int cols = matrix1[0].length;

        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        return result;
    }
    public static double[][] add(double[][] matrix1, double[][] matrix2){
        if (!haveSameDimension(matrix1, matrix2)) {
            return null;
        }

        int rows = matrix1.length;
        int cols = matrix1[0].length;

        double[][] result = new double[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        return result;
    }

    public static int[][] subtract(int[][] matrix1, int[][] matrix2){
        if (!haveSameDimension(matrix1, matrix2)) {
            return null;
        }

        int rows = matrix1.length;
        int cols = matrix1[0].length;

        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }

        return result;
    }
    public static double[][] subtract(double[][] matrix1, double[][] matrix2){
        if (!haveSameDimension(matrix1, matrix2)) {
            return null;
        }

        int rows = matrix1.length;
        int cols = matrix1[0].length;

        double[][] result = new double[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }

        return result;
    }

    public static int[][] multiply(int[][] matrix1, int[][] matrix2){
        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int rows2 = matrix2.length;
        int cols2 = matrix2[0].length;

        if (cols1 != rows2) {
            // Xử lý khi số cột của matrix1 không bằng số hàng của matrix2
            return null;
        }

        int[][] result = new int[rows1][cols2];

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        return result;
    }
    public static double[][] multiply(double[][] matrix1, double[][] matrix2){
        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int rows2 = matrix2.length;
        int cols2 = matrix2[0].length;

        if (cols1 != rows2) {
            return null;
        }

        double[][] result = new double[rows1][cols2];

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        return result;
    }

}
