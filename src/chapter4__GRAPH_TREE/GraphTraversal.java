package chapter4__GRAPH_TREE;

public class GraphTraversal {


    public static void main(String[] args) {


        GeekGraph g = new GeekGraph(5, GeekGraph.GraphType.UNDIRECTED);
        g.addEdge(g, 0, 1);
        g.addEdge(g, 0, 4);
        g.addEdge(g, 1, 2);
        g.addEdge(g, 1, 3);
        g.addEdge(g, 1, 4);
        g.addEdge(g, 2, 3);
        g.addEdge(g, 3, 4);

        g.printGraph(g);




    }



}

/**
 *      undirected graph
 *
 *      0 --- 1
 *      |   /   \
 *      |  /     2
 *      4 --- 3 /
 *
 */

/**
        DIRECTED
        0  ->  1  \
        |   /  |   \
        |  /   |   V
        | V    |   2
        V      V  /
        4 <--  3 V

 */
