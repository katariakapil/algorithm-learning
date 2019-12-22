package bytebybyte;

import java.util.Map;

public class IsBalancedBinaryTree {

    public static void main(String[] args) {

        Node root = new Node(9);
        root.left = new Node(2);
        root.right = new Node(2);
        root.right.right = new Node(2);
        root.right.right.right = new Node(2);
        root.right.right.right.right = new Node(2);

       int rs =  isBalanced(root);

        System.out.println(rs );


    }

    private static int isBalanced(Node root) {

        if (root == null) return 0;

        int l = isBalanced(root.left) + 1;
        int r = isBalanced(root.right) + 1;

        System.out.println("left"+l);
        System.out.println("right"+r);

        if (Math.abs(l - r) > 1) {
            System.out.println("NOT BALANCED ");
        }

        return Math.max(l, r);

    }

    static class Node {

        int val;
        Node left;
        Node right;

        Node(int val){
            this.val = val;
        }
    }
}
