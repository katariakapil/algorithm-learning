package chapter4__GRAPH_TREE;

import java.util.LinkedList;
import java.util.Queue;

public class MinimalTree {
    public static void main(String[] args) {

        //given a sorted array build a minimal height tree.   Binary Search Tree

        int [] d = {1,2,3,4,5,6,7,8,9,10};

       Node tree =  createMinimalTree(d, 0 , d.length -1 );

       Queue<Node> queue  = new LinkedList<>();
       queue.offer(tree);

       while (!queue.isEmpty()) {

           Node n = queue.poll();
           System.out.println(n.val);

           if (n.left != null) {
               queue.offer(n.left);
           }

           if (n.right != null) {
               queue.offer(n.right);
           }

       }

    }

    private static Node createMinimalTree(int[] d, int start, int end) {

        if (start > end ) return null;

        int mid = start + (end - start ) /2;
        System.out.println(mid + " === " + d[mid]);
        Node tree = new Node(d[mid]);
        tree.left  = createMinimalTree(d, start, mid -1 );
        tree.right = createMinimalTree(d, mid + 1 , end);

        return tree;

    }


    static class Node {

        int val;
        Node left;
        Node right;

        public Node(int d) {
            this.val = d;
        }

    }
}
