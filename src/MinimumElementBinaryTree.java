public class MinimumElementBinaryTree {

    /*  A binary tree node has key, pointer to left child
and a pointer to right child */
    static class Node
    {
        int key;

        Node  left,  right;
    };

/*  Utility that allocates a new node with the
  given key and null left and right pointers.  */

    static Node  newnode(int key)
    {

        Node  node = new Node();
        node.key = key;
        node.left = node.right  = null;
        return (node);
    }
    // Driver program to run the case
    public static void main(String args[])
    {

        Node  root = newnode(9);
        root.left    = newnode(4);
        root.right   = newnode(17);
        root.left.left = newnode(3);
        root.left.right = newnode(6);
        root.left.right.left = newnode(5);
        root.left.right.right = newnode(7);
        root.right.right = newnode(22);
        root.right.right.left = newnode(20);
        int k = 18;
        maxDiff(root, k);
        System.out.println(" Answer is "  +answer);

    }

    static int mindiff,answer;

    private static void maxDiff(Node root, int k) {
        mindiff = Integer.MAX_VALUE;//set the max value as beginning.
        getMin(root,k);
    }

    private static void getMin(Node root, int k) {

        if (root == null) return;

        if (root.key == k) {

            mindiff = k;//return if we get a match of element.
            answer = root.key;
        }

        if (mindiff > Math.abs(root.key - k)) {

            mindiff = Math.abs(root.key -k);
            answer = root.key;
        }

        if (k < root.key) {
            getMin(root.left,k);
        }else {
            getMin(root.right,k);
        }
    }
}
