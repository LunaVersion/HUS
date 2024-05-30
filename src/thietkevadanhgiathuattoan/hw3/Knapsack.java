package thietkevadanhgiathuattoan.hw3;

public class Knapsack {
    private int n; // số lượng mặt hàng
    private double m; // sức chứa của cái túi
    private double[] w; // trọng lượng của các mặt hàng
    private double[] v; // giá trị của các mặt hàng
    private double[] x; // các mặt hàng được chọn
    private double weight; // trọng lượng hiện tại của cái túi
    private double sum; // giá trị hiện tại của cái túi
    private double f; // giá trị tốt nhất tìm được

    public void knapsack(int i) {
        if (i == n || m - weight <= 0) {
            if (sum > f) {
                f = sum;
            }
            return;
        }
        for (double j = (m - weight) / w[i]; j >= 0; j--) {
            x[i] = j;
            weight += w[i] * x[i];
            sum += v[i] * x[i];
            double g = sum + v[i+1] * (m - weight) / w[i+1];
            if (g > f) {
                knapsack(i + 1);
            }
            weight -= w[i] * x[i];
            sum -= v[i] * x[i];
        }
    }

    public static void main(String[] args) {
        Knapsack knapsackProblem = new Knapsack();
        knapsackProblem.n = 10;
        knapsackProblem.m = 15.3;
        knapsackProblem.w = new double[]{2.4, 3.3, 4.8, 5.0, 9.5}; // trọng lượng
        knapsackProblem.v = new double[]{3.0, 4.0, 5.0, 8.0, 10.0}; // giá trị
        knapsackProblem.x = new double[knapsackProblem.n]; // lưu trữ mặt hàng được chọn
        knapsackProblem.weight = 0.0; // Trọng lượng hiện tại
        knapsackProblem.sum = 0.0; // Giá trị hiện tại
        knapsackProblem.f = 0.0; // Giá trị tốt nhất tìm được
        knapsackProblem.knapsack(0);
        System.out.println(knapsackProblem.f);
    }
}

