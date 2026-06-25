package SafeRoad;

import java.util.*;

public class GraphAlgorithms {

    private int vertices;
    private LinkedList<Integer>[] adjacencyList;

    public GraphAlgorithms(int vertices) {

        this.vertices = vertices;
        adjacencyList = new LinkedList[vertices];

        for (int i = 0; i < vertices; i++) {
            adjacencyList[i] = new LinkedList<>();
        }
    }

    // Add Edge
    public void addEdge(int source, int destination) {
        adjacencyList[source].add(destination);
    }
    
    // BFS Traversal
    public void BFS(int startVertex) {

        boolean[] visited = new boolean[vertices];
        Queue<Integer> queue = new LinkedList<>();

        visited[startVertex] = true;
        queue.add(startVertex);

        System.out.println("BFS Traversal:");

        while (!queue.isEmpty()) {

            int vertex = queue.poll();
            System.out.print(vertex + " ");

            for (int adjacent : adjacencyList[vertex]) {

                if (!visited[adjacent]) {
                    visited[adjacent] = true;
                    queue.add(adjacent);
                }
            }
        }

        System.out.println();
    }

    // DFS Traversal
    public void DFS(int vertex, boolean[] visited) {

        visited[vertex] = true;

        System.out.print(vertex + " ");

        for (int adjacent : adjacencyList[vertex]) {

            if (!visited[adjacent]) {
                DFS(adjacent, visited);
            }
        }
    }
}