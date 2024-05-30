package hus.oop.matrix;

import java.util.Arrays;
import java.util.Random;

public class SquareMatrix {
    private int[][] data;
    private double[][] that;

    public SquareMatrix(int[][] data) {
        this.data = data;
    }

    /**
     * Hàm dựng, khởi tạo một ma trận có các phần tử được sinh ngẫu nhiên trong khoảng [1, 100]
     *
     * @param size
     */
    public SquareMatrix(int size) {
        initRandom(size);
    }

    /**
     * Phương thức khởi tạo ma trận, các phần tử của ma trận được sinh ngẫu nhiên trong khoảng [1, 100]
     *
     * @param size
     * @return
     */
    private void initRandom(int size) {
        /* TODO */
        data = new int[size][size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                data[i][j] = random.nextInt(100) + 1;
            }
        }
    }

    /**
     * Phương thức lấy ra các phần tử trên đường chéo chính của ma trận.
     *
     * @return đường chéo chính của ma trận.
     */
    public int[] principalDiagonal() {
        /* TODO */
        int sizeDiagonal = data.length;
        int[] diagonal = new int[sizeDiagonal];
        for (int i = 0; i < sizeDiagonal; i++) {
            diagonal[i] = data[i][i];
        }

        return diagonal;
    }

    /**
     * Phương thức lấy ra các phần tử trên đường chéo phụ của ma trận.
     *
     * @return đường chéo phụ của ma trận.
     */
    public int[] secondaryDiagonal() {
        /* TODO */
        int sizeSecond = data.length;
        int[] diagonal = new int[sizeSecond];

        for (int i = 0; i < sizeSecond; i++) {
            diagonal[i] = data[i][sizeSecond - i - 1];
        }

        return diagonal;
    }

    /**
     * Phương thức lấy ra các số là số nguyên tố trong ma trận.
     *
     * @return các số nguyên tố trong ma trận.
//     */
//    public int[] primes() {
//        /* TODO */
//        int length = data.length;
//        boolean[] isPrime = new boolean[101];
//        Arrays.fill(isPrime, true);
//        isPrime[0] = isPrime[1] = false;
//
//        for (int i = 2; i <= 100; i++) {
//            if (isPrime[i]) {
//                for (int j = i * i; j <= 100; j += i) {
//                    isPrime[j] = false;
//                }
//            }
//        }
//        int count = 0;
//        for (int i = 0; i < length; i++) {
//            for (int j = 0; j < length; j++) {
//                if (isPrime[data[i][j]]) {
//                    count++;
//                }
//            }
//        }
//        int[] primesData = new int[count];
//        int index = 0;
//        for (int i = 0; i < length; i++) {
//            for (int j = 0; j < length; j++) {
//                if (isPrime[data[i][j]]) {
//                    primesData[index++] = data[i][j];
//                }
//            }
//            return primesData;
//        }
//    }
////
//            /**
//             * Phương thức sắp xếp các phần tử của ma trận theo thứ tự tăng dần.
//             * @return ma trận có các phần tử là phần tử của ma trận ban đầu được sắp xếp theo thứ tự tăng dần.
//             * Các phần tử được sắp xếp theo thứ tự từ trái sang phải ở mỗi hàng, và từ trên xuống dưới.
//             */
//            public SquareMatrix getSortedMatrix() {
//                /* TODO */
//                int lengthData = data.length;
//                int[][] sortedData = new int[lengthData][lengthData];
//                for (int i = 0; i < lengthData; i++) {
//                    sortedData[i] = Arrays.copyOf(data[i], lengthData);
//                    Arrays.sort(sortedData[i]);
//                }
//                return sortedData;
//            }
//
//
//            /**
//             * Lấy giá trị phần tử ở vị trí (row, col).
//             * @param row
//             * @param col
//             * @return
//             */
//            public int get(int row, int col){
//                /* TODO */
//                return data[row][col];
//            }
//
//            /**
//             * Sửa giá trị phần tử ở vị trí (row, col) thành value.
//             * @param row
//             * @param col
//             * @param value
//             */
//            public void set(int row, int col, int value){
//                /* TODO */
//                data[row][col] = value;
//            }
//
//            /**
//             * Phương thức cộng ma trận hiện tại với một ma trận khác.
//             * @param that
//             * @return ma trận mới là ma trận tổng của 2 ma trận.
//             */
//            public SquareMatrix add(SquareMatrix that){
//                /* TODO */
//                int sizeMatrix = data.length;
//                int[][] addData = new int[sizeMatrix][sizeMatrix];
//                for (int i = 0; i < sizeMatrix; i++) {
//                    for (int j = 0; j < sizeMatrix; j++) {
//                        addData[i][j] = data[i][j] + that[i][j];
//                    }
//                }
//                return new SquareMatrix(addData);
//            }
//
//            /**
//             * Phương thức trừ ma trận hiện tại cho một ma trận khác.
//             * @param that
//             * @return ma trận mới là ma trận hiệu của ma trận hiện tại và ma trận truyền vào.
//             */
//            public SquareMatrix minus(SquareMatrix that){
//                /* TODO */
//            }
//
//            /**
//             * Phương thức nhân ma trận hiện tại với một ma trận khác.
//             * @param that
//             * @return ma trận mới là ma trận nhân của ma trận hiện tại với ma trận truyền vào.
//             */
//            public SquareMatrix multiply (SquareMatrix that){
//                /* TODO */
//            }
//
//            /**
//             * Phương thức nhân ma trận với một số vô hướng.
//             * @param value
//             * @return ma trận mới là ma trận hiện tại được nhân với một số vô hướng.
//             */
//            public SquareMatrix scaled( int value){
//                /* TODO */
//            }
//
//            /**
//             * Phương thức lấy ma trận chuyển vị.
//             * @return ma trận mới là ma trận chuyển vị của ma trận hiện tại.
//             */
//            public SquareMatrix transpose() {
//                /* TODO */
//            }
//
//            /**
//             * Mô tả ma trận theo định dạng biểu diễn ma trận, ví dụ
//             *   1 2 3
//             *   4 5 6
//             *   7 8 9
//             * @return một chuỗi mô tả ma trận.
//             */
//            @Override
//            public String toString() {
//                /* TODO */
//            }
    }

