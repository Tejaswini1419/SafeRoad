package SafeRoad;

public class EmergencyRoute {

    static final int V = 6;

    int minDistance(int dist[], Boolean visited[]) {

        int min = Integer.MAX_VALUE;
        int minIndex = -1;

        for (int v = 0; v < V; v++) {

            if (!visited[v] && dist[v] <= min) {
                min = dist[v];
                minIndex = v;
            }
        }

        return minIndex;
    }

    void dijkstra(int graph[][], int source) {

        int dist[] = new int[V];
        Boolean visited[] = new Boolean[V];

        for (int i = 0; i < V; i++) {
            dist[i] = Integer.MAX_VALUE;
            visited[i] = false;
        }

        dist[source] = 0;

        for (int count = 0; count < V - 1; count++) {

            int u = minDistance(dist, visited);
            visited[u] = true;
            for (int v = 0; v < V; v++) {

                if (!visited[v] && graph[u][v] != 0 &&
                        dist[u] != Integer.MAX_VALUE &&
                        dist[u] + graph[u][v] < dist[v]) {

                    dist[v] = dist[u] + graph[u][v];
                }
            }
        }

        printSolution(dist);
    }

    void printSolution(int dist[]) {

        System.out.println("Shortest Emergency Routes:");

        for (int i = 0; i < V; i++) {
            System.out.println("To Node " + i + " Distance: " + dist[i]);
        }
    }
}
