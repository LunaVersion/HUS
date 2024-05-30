package thietkevadanhgiathuattoan.Hw4_21000684_LeThiHuong;

import java.util.*;

public class MinimalSpanningTreePrim {
    static class Graph {
        int V;
        List<Edge>[] adjList;

        Graph(int V) {
            this.V = V;
            adjList = new ArrayList[V];
            for (int i = 0; i < V; i++) {
                adjList[i] = new ArrayList<>();
            }
        }

        void addEdge(int from, int to, int weight) {
            adjList[from].add(new Edge(from, to, weight));
            adjList[to].add(new Edge(to, from, weight)); // Undirected graph
        }
    }

    static class Edge {
        int from, to, weight;

        Edge(int from, int to, int weight) {
            this.from = from;
            this.to = to;
            this.weight = weight;
        }
    }
    private static final int INF = Integer.MAX_VALUE;

    public static List<Edge> primMST(Graph graph) {
        List<Edge> MST = new ArrayList<>();
        Set<Integer> visited = new HashSet<>();
        PriorityQueue<Edge> pq = new PriorityQueue<>(Comparator.comparingInt(edge -> edge.weight));

        // Start from the first vertex
        int startVertex = 0;
        visited.add(startVertex);

        while (visited.size() < graph.V - 1) {
            // Add all edges from the current vertex to the priority queue
            for (Edge edge : graph.adjList[startVertex]) {
                if (!visited.contains(edge.to)) {
                    pq.offer(edge);
                }
            }

            // Get the edge with the smallest weight
            Edge minEdge = pq.poll();

            // Add the selected edge to the MST
            MST.add(minEdge);

            // Move to the next vertex
            startVertex = minEdge.to;
            visited.add(startVertex);
        }

        return MST;
    }

    public static void main(String[] args) {
        // Example usage
        int V = 5; // Number of vertices
        Graph graph = new Graph(V);
        graph.addEdge(0, 1, 2);
        graph.addEdge(0, 3, 6);
        graph.addEdge(1, 2, 3);
        graph.addEdge(1, 3, 8);
        graph.addEdge(1, 4, 5);
        graph.addEdge(2, 4, 7);
        graph.addEdge(3, 4, 9);

        List<Edge> MST = primMST(graph);
        System.out.println("Minimum Spanning Tree:");
        for (Edge edge : MST) {
            System.out.println(edge.from + " - " + edge.to + ": " + edge.weight);
        }
    }


}
