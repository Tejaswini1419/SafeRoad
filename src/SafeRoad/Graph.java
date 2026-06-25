package SafeRoad;

public class Graph {

    int[][] graph = {
            {0,4,2,0,0},
            {4,0,1,5,0},
            {2,1,0,8,10},
            {0,5,8,0,2},
            {0,0,10,2,0}
    };

    String[] places = {
            "Hospital",
            "Junction A",
            "Junction B",
            "City Road",
            "Accident Site"
    };

    public void dijkstra(int source) {

        int n = graph.length;

        int[] dist = new int[n];
        boolean[] visited = new boolean[n];

        for(int i=0;i<n;i++)
            dist[i]=Integer.MAX_VALUE;

        dist[source]=0;

        for(int count=0;count<n-1;count++) {

            int u=-1,min=Integer.MAX_VALUE;

            for(int i=0;i<n;i++) {
                if(!visited[i] && dist[i]<min){
                    min=dist[i];
                    u=i;
                }
            }

            visited[u]=true;

            for(int v=0;v<n;v++) {

                if(graph[u][v]!=0 &&
                        !visited[v] &&
                        dist[u]+graph[u][v] < dist[v]) {

                    dist[v]=dist[u]+graph[u][v];
                }
            }
        }

        System.out.println("\nFastest Route Distances:");

        for(int i=0;i<n;i++) {
            System.out.println(
                    places[i]+" : "+dist[i]+" km"
            );
        }
    }

    public void nearestUnit() {

        System.out.println("\nNearest Emergency Unit Found");
        System.out.println("Ambulance A12");
        System.out.println("Distance : 3 km");
    }
}