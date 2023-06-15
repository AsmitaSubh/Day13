import java.util.LinkedList;
import java.util.Queue;

    public class BFSGraph {
        private int vertices;
        private LinkedList<Integer>[] adjacencyList;

        public BFSGraph(int vertices) {
            this.vertices = vertices;
            adjacencyList = new LinkedList[vertices];

            for (int i = 0; i < vertices; i++) {
                adjacencyList[i] = new LinkedList<>();
            }
        }

        public void addEdge(int source, int destination) {
            adjacencyList[source].add(destination);
        }

        public void BFS(int startVertex) {
            boolean[] visited = new boolean[vertices];
            Queue<Integer> queue = new LinkedList<>();

            visited[startVertex] = true;
            queue.add(startVertex);

            while (!queue.isEmpty()) {
                int currentVertex = queue.poll();
                System.out.print(currentVertex + " ");

                LinkedList<Integer> neighbors = adjacencyList[currentVertex];
                for (int neighbor : neighbors) {
                    if (!visited[neighbor]) {
                        visited[neighbor] = true;
                        queue.add(neighbor);
                    }
                }
            }
        }

        public static void main(String[] args) {
            BFSGraph graph = new BFSGraph(6);

            graph.addEdge(0, 1);
            graph.addEdge(0, 2);
            graph.addEdge(1, 3);
            graph.addEdge(1, 4);
            graph.addEdge(2, 4);
            graph.addEdge(3, 4);
            graph.addEdge(3, 5);
            graph.addEdge(4, 5);

            System.out.println("BFS Traversal starting from vertex 0:");
            graph.BFS(0);
        }
    }

