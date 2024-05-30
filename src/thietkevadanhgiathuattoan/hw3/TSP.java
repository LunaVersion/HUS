package thietkevadanhgiathuattoan.hw3;

import java.util.Arrays;

public class TSP {
    private int n; // Số lượng thành phố
    private int[][] graph; // Ma trận chi phí
    private boolean[] visited; // Đánh dấu các thành phố đã thăm
    private int[] path; // Lộ trình tạm thời
    private int[] bestPath; // Lộ trình tốt nhất
    private int bestCost; // Chi phí tốt nhất

    public TSP(int[][] graph) {
        this.n = graph.length;
        this.graph = graph;
        this.visited = new boolean[n];
        this.path = new int[n];
        this.bestPath = new int[n];
        this.bestCost = Integer.MAX_VALUE;
    }

    // Phương thức để giải quyết bài toán TSP bằng phương pháp nhánh cận
    public void tsp(int currentCity, int currentCost, int depth) {
        if (depth == n) { // Đã thăm hết tất cả các thành phố
            if (graph[currentCity][0] > 0 && currentCost + graph[currentCity][0] < bestCost) {
                bestCost = currentCost + graph[currentCity][0];
                System.arraycopy(path, 0, bestPath, 0, n);
            }
            return;
        }

        for (int nextCity = 0; nextCity < n; nextCity++) {
            if (!visited[nextCity] && graph[currentCity][nextCity] > 0 && currentCost + lowerBound(nextCity, depth) < bestCost) {
                visited[nextCity] = true;
                path[depth] = nextCity;
                tsp(nextCity, currentCost + graph[currentCity][nextCity], depth + 1);
                visited[nextCity] = false;
            }
        }
    }

    // Phương thức để tính toán giới hạn dưới cho lời giải
    private int lowerBound(int currentCity, int depth) {
        int lb = 0;
        boolean[] remaining = Arrays.copyOf(visited, n);
        remaining[currentCity] = true;
        for (int i = depth + 1; i < n; i++) {
            int minCost = Integer.MAX_VALUE;
            int minCity = -1;
            for (int j = 0; j < n; j++) {
                if (!remaining[j] && graph[path[i - 1]][j] > 0 && graph[path[i - 1]][j] < minCost) {
                    minCost = graph[path[i - 1]][j];
                    minCity = j;
                }
            }
            if (minCity != -1) {
                lb += minCost;
                remaining[minCity] = true;
            }
        }
        return lb;
    }

    // Phương thức để in ra lộ trình tốt nhất và chi phí tương ứng
    public void printBestPath() {
        System.out.print("Best Path: ");
        for (int city : bestPath) {
            System.out.print(city + " ");
        }
        System.out.println("0");
        System.out.println("Best Cost: " + bestCost);
    }

    public static void main(String[] args) {
        int[][] graph = {
                {0, 10, 15, 20},
                {10, 0, 35, 25},
                {15, 35, 0, 30},
                {20, 25, 30, 0}
        };
        TSP tspSolver = new TSP(graph);
        tspSolver.visited[0] = true; // Bắt đầu từ thành phố 0
        tspSolver.tsp(0, 0, 1);
        tspSolver.printBestPath();
    }
}
