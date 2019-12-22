package core_java;

import java.util.LinkedList;

public class Graph {

    /**
    1 -> 2 -> 3
         |
         V
         4 -> 5

     */
    LinkedList<Integer>[] nodes;
    GraphType type;
    int v;

    Graph(int v) {
        this.v = v;// number of vertices

        nodes = new LinkedList[v];

        for (int i=0;i<v;i++) {
            nodes[i] = new LinkedList();
        }
        type = GraphType.DIRECTED;
    }

   void addEdge(Graph graph, int source , int destination) {

        graph.nodes[source].add(destination);
        if (graph.type == GraphType.UNDIRECTED) {
            graph.nodes[destination].add(source);

        }
   }

    public static void main(String[] args) {

        Graph g = new Graph(5);
        g.addEdge(g, 1, 2 );
        g.addEdge(g, 2, 3);
        g.addEdge(g, 2, 4);
        g.addEdge(g, 4, 5);

        for (int i=0;i<g.v;i++) {

            System.out.println("VERTEX "+i);
            for (int v : g.nodes[i]) {
                System.out.print("->"+v);
            }
        }

    }

}

enum GraphType {

    DIRECTED,
    UNDIRECTED
}

