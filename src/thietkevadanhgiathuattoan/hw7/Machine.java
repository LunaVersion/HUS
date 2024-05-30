package thietkevadanhgiathuattoan.hw7;

import java.util.Arrays;
import java.util.Comparator;

class Order {
    int start;
    int end;
    int cost;

    public Order(int start, int end, int cost) {
        this.start = start;
        this.end = end;
        this.cost = cost;
    }
}
public class Machine {
    public static int maximizeRevenue(Order[] orders) {
        Arrays.sort(orders, Comparator.comparingInt(o -> o.end));

        int n = orders.length;
        int[] dp = new int[n];
        dp[0] = orders[0].cost;

        for (int i = 1; i < n; i++) {
            int includeCurrent = orders[i].cost; // Tổng chi phí đơn đặt hàng hiện tại
            int latestNonOverlapIndex = findLatestNonOverlap(orders, i);
            if (latestNonOverlapIndex != -1) {
                includeCurrent += dp[latestNonOverlapIndex];
                printOrders(orders,latestNonOverlapIndex);
            }
            dp[i] = Math.max(dp[i - 1], includeCurrent);
        }

        return dp[n - 1];
    }

    // Tìm chỉ số của đơn đặt hàng gần nhất không giao nhau với đơn hiện tại
    private static int findLatestNonOverlap(Order[] orders, int currentIndex) {
        for (int i = currentIndex - 1; i >= 0; i--) {
            if (orders[i].end <= orders[currentIndex].start) {
                //printOrders(orders,i);
                return i;
            }
        }
        return -1;
    }

    public static void printOrders(Order[] orders, int i) {
        System.out.println("Start time: " + orders[i].start + ", End time: " + orders[i].end + ", Cost: " + orders[i].cost);
    }

    public static void main(String[] args) {
        Order[] orders = {
                new Order(1, 3, 50),
                new Order(2, 5, 60),
                new Order(6, 8, 70),
                new Order(4, 7, 80)
        };

        int maxRevenue = maximizeRevenue(orders);
        System.out.println("Max revenue: " + maxRevenue);
    }
}
