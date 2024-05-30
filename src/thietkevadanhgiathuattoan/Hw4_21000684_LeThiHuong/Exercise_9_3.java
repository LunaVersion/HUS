package thietkevadanhgiathuattoan.Hw4_21000684_LeThiHuong;

import java.util.Arrays;

/*
Thuật toán Dijkstra chỉ tìm các khoảng cách từ một đỉnh cho
trước đến tất cả các đỉnh khác trong đồ thị được biểu diễn
bằng ma trận trọng số
 */

public class Exercise_9_3 {
    public static int[] dijkstra(int[][] weightMatrix, int startVertex) {
        int numVertices = weightMatrix.length;
        int[] distances = new int[numVertices];
        boolean[] visited = new boolean[numVertices];

        Arrays.fill(distances, Integer.MAX_VALUE);
        distances[startVertex] = 0;

        for (int count = 0; count < numVertices - 1; count++) {
            int u = minDistance(distances, visited);
            visited[u] = true;

            for (int v = 0; v < numVertices; v++) {
                if (!visited[v] && weightMatrix[u][v] != 0 && distances[u] != Integer.MAX_VALUE
                        && distances[u] + weightMatrix[u][v] < distances[v]) {
                    distances[v] = distances[u] + weightMatrix[u][v];
                }
            }
        }

        return distances;
    }

    private static int minDistance(int[] distances, boolean[] visited) {
        int min = Integer.MAX_VALUE;
        int minIndex = -1;

        for (int v = 0; v < distances.length; v++) {
            if (!visited[v] && distances[v] <= min) {
                min = distances[v];
                minIndex = v;
            }
        }

        return minIndex;
    }

    public static void main(String[] args) {
        int[][] weightMatrix = {
                {0, 4, 0, 0, 0, 0, 0, 8, 0},
                {4, 0, 8, 0, 0, 0, 0, 11, 0},
                {0, 8, 0, 7, 0, 4, 0, 0, 2},
                {0, 0, 7, 0, 9, 14, 0, 0, 0},
                {0, 0, 0, 9, 0, 10, 0, 0, 0},
                {0, 0, 4, 14, 10, 0, 2, 0, 0},
                {0, 0, 0, 0, 0, 2, 0, 1, 6},
                {8, 11, 0, 0, 0, 0, 1, 0, 7},
                {0, 0, 2, 0, 0, 0, 6, 7, 0}
        };

        int startVertex = 0;
        int[] distances = dijkstra(weightMatrix, startVertex);

        System.out.println("Distances from vertex " + startVertex + " to all other vertices:");
        for (int i = 0; i < distances.length; i++) {
            System.out.println("Vertex " + i + ": " + distances[i]);
        }
    }
}
