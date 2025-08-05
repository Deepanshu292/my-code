import java.util.*;
public class dfs3 {
    import java.util.*;



    static class Edge {
        int src, dest, wt;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        // Add edges (directed graph for cycle detection)
        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));

        graph[1].add(new Edge(1, 3, 1));

        graph[2].add(new Edge(2, 3, 1));

        // Uncomment below to create a cycle
        // graph[3].add(new Edge(3, 0, 1));
    }

    public static void printAllPath(ArrayList<Edge> graph[], boolean vis[], int curr, String path, int tar) {
        if (curr == tar) {
            System.out.println(path + tar);
            return;
        }

        vis[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!vis[e.dest]) {
                printAllPath(graph, vis, e.dest, path + curr + " -> ", tar);
            }
        }

        vis[curr] = false;  // backtrack
    }

    public static boolean isCycleDirected(ArrayList<Edge> graph[], boolean vis[], int curr, boolean rec[]) {
        vis[curr] = true;
        rec[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (rec[e.dest]) {
                return true; // cycle found
            } else if (!vis[e.dest]) {
                if (isCycleDirected(graph, vis, e.dest, rec)) {
                    return true;
                }
            }
        }

        rec[curr] = false; // backtrack
        return false;
    }

    public static void main(String[] args) {
        int V = 4;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);

        boolean[] visited = new boolean[V];
        boolean[] recStack = new boolean[V];
        boolean cycleExists = false;

        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                if (isCycleDirected(graph, visited, i, recStack)) {
                    cycleExists = true;
                    break;
                }
            }
        }

        System.out.println("Cycle exists in directed graph: " + cycleExists);
    }
}

    

