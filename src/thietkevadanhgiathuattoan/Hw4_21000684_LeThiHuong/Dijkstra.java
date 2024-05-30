package thietkevadanhgiathuattoan.Hw4_21000684_LeThiHuong;

import java.util.*;

public class Dijkstra {
    static final int INF = Integer.MAX_VALUE;

    static class Edge {
        int destination;
        int weight;

        public Edge(int destination, int weight) {
            this.destination = destination;
            this.weight = weight;
        }
    }

    public static void dijkstra(ArrayList<ArrayList<Edge>> graph, int source) {
        int V = graph.size();
        int[] distance = new int[V];
        Arrays.fill(distance, INF);
        distance[source] = 0;

        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> distance[a] - distance[b]);
        pq.offer(source);

        while (!pq.isEmpty()) {
            int u = pq.poll();
            for (Edge edge : graph.get(u)) {
                int v = edge.destination;
                int w = edge.weight;
                if (distance[u] + w < distance[v]) {
                    distance[v] = distance[u] + w;
                    pq.offer(v);
                }
            }
        }

        // In kết quả
        System.out.println("Đường đi ngắn nhất từ đỉnh nguồn:");
        for (int i = 0; i < V; i++) {
            System.out.println("Đỉnh " + source + " đến đỉnh " + i + ": " + distance[i]);
        }
    }

    public static void main(String[] args) {
        int V = 5;
        ArrayList<ArrayList<Edge>> graph = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<>());
        }

        // Thêm cạnh vào đồ thị
        graph.get(0).add(new Edge(1, 10));
        graph.get(0).add(new Edge(3, 5));
        graph.get(1).add(new Edge(2, 1));
        graph.get(1).add(new Edge(3, 2));
        graph.get(2).add(new Edge(4, 4));
        graph.get(3).add(new Edge(1, 3));
        graph.get(3).add(new Edge(2, 9));
        graph.get(3).add(new Edge(4, 2));
        graph.get(4).add(new Edge(0, 7));
        graph.get(4).add(new Edge(2, 6));

        dijkstra(graph, 0);
    }
}
