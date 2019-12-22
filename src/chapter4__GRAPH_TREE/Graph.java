package chapter4__GRAPH_TREE;

/**
 * Adjancency List representation of graph
 *
 * // BFS is highly recommended to find shortest path between 2 nodes.
 *
 * A finite set of vertices also called as nodes.
 *
 * A finite set of ordered pair of the form (u, v) called as edge
 *
 * The pair is ordered because (u, v) is not same as (v, u) in case of a directed graph(di-graph).
 */
public class Graph<T> {
    Node<T>[] nodes;
}


class Node<T>{
    T data;
    Node<T>[] children;

    Node(T data, Node[] children) {
        this.data = data;
        this.children = children;
    }
}
