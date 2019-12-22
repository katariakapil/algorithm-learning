public class SumOfLeftLeaves {
    /**
     *   Find the sum of all left leaves in a given binary tree.   RS = 24 ( 9 + 15 ) are left leave nodes.
     *     3
     *    / \
     *   9  20
     *     /  \
     *    15   7
     */

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        int rs = sumOfLeftLeaves(root);
        System.out.println("Result " + rs);

    }

    static int sum = 0;
    public static int sumOfLeftLeaves(TreeNode root) {

        traverse(root);
        return sum;
    }

    static void traverse(TreeNode root) {

        if (root == null ) return;

        if (root.left != null && root.left.left == null && root.left.right == null )
            sum += root.left.val;

        traverse(root.left);
        traverse(root.right);

    }

}
