package thietkevadanhgiathuattoan.Hw4_21000684_LeThiHuong;

import java.util.Arrays;

public class Knapsack {
    private int n; // số lượng mặt hàng
    private double m; // sức chứa của cái túi
    private double[] w; // trọng lượng của các mặt hàng
    private double[] v; // giá trị của các mặt hàng

    public double[] knapsack() {
        double[] x = new double[n]; // số các mặt hàng được chọn
        double[] unitValue = new double[n];
        for (int j = 0; j < n; j++) {
            unitValue[j] = v[j] / w[j];
        }
        Arrays.sort(unitValue);

        for (int i = 0; i < n; i++) {
            x[i] = 0;
        }
        int i = 1;
        while (i < n && m > 0) {
            x[i] = m / unitValue[i];
            m -= x[i] * unitValue[i];
            i++;
        }
        if (m > 0) return new double[]{-1};
        return x;
    }

    public static void print(double[] A) {
        for (double value : A) {
            System.out.print(value + " ");
        }
    }

    public static void main(String[] args) {
        Knapsack knapsack = new Knapsack();
        knapsack.w = new double[]{12, 1, 4, 1, 2};
        knapsack.v = new double[]{4, 2, 10, 1, 2};
        knapsack.n = 5;
        knapsack.m = 15;
        print(knapsack.knapsack());
    }
}
