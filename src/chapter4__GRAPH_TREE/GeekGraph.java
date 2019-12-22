package chapter4__GRAPH_TREE;

import java.util.LinkedList;

public class GeekGraph {

    /**
     *      undirected graph
     *
     *      0 --- 1
     *      |   /   \
     *      |  /     2
     *      4 --- 3 /
     *
     */

    GraphType type;

    enum GraphType {

        DIRECTED,
        UNDIRECTED

    }
    int v;//number of vertices

    LinkedList<Integer>[] adjNodes;

    public GeekGraph(int v, GraphType type) {

        // no of nodes
        this.v = v;
        this.type = type;

        adjNodes = new LinkedList[v];// initialize with number of vertices

        for (int i=0;i<v;i++) {
            adjNodes[i] = new LinkedList<>(); // set a new list on each vertices.
        }
    }

    public void addEdge(GeekGraph g , int source, int destination ){

        g.adjNodes[source].add(destination);// add to source destination vertices
        if (this.type == GraphType.DIRECTED) {
            //if its a directed graph then only add reverse connection
            g.adjNodes[destination].add(source);// add to source destination vertices
        }
    }

    public void printGraph (GeekGraph g ) {

        for (int i=0;i<g.v;i++) {

            LinkedList<Integer> vertice = g.adjNodes[i];
            System.out.println("Adjacency list of vertex "+ i);
            System.out.print("head");

            for (int j=0;j<vertice.size();j++) {
                System.out.println(" ->"+vertice.get(j));
            }
        }
    }
}

