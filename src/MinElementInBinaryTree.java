public class MinElementInBinaryTree {

    public static void main(String[] args) {

        MinElementInBinaryTree a = new MinElementInBinaryTree();

        Node root = new Node();

        a.getMinElement(root);

    }

    int minVal;
    long ans = Long.MAX_VALUE;

    int getMinElement(Node root) {

        minVal = root.val;
        dfs(root);


        return ans < Long.MAX_VALUE ? (int) ans : -1;
    }

    void dfs(Node node) {

        if (node != null) {

            if (minVal < node.val && node.val < ans  ) {//v imp condition
                ans = node.val;
            } else if (minVal == node.val) {
                dfs(node.left);
                dfs(node.right);
            }
        }
    }

    static class Node {

        int val;
        Node left;
        Node right;
    }
}
