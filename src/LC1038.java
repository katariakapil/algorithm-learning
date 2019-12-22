public class LC1038 {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int n) {
            this.val = n;
        }
    }


    public static void main(String[] args) {

        TreeNode root = new TreeNode(4);
        root.right = new TreeNode(6);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(7);
        root.right.right.right = new TreeNode(8);

        root.left = new TreeNode(1);
        root.left.right = new TreeNode(2);
        root.left.left = new TreeNode(0);
        root.left.right.right = new TreeNode(3);

        bstToGst(root);


    }

   static int sum =0;
    public static TreeNode bstToGst(TreeNode root) {
        if (root == null) return null;
        trav(root);
        return root;
    }

    public static void trav(TreeNode node) {

        if (node == null) return;

        trav(node.right);
        sum += node.val;
        node.val = sum;
        trav(node.left);

    }


}
