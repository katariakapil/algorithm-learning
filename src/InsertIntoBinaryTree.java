public class InsertIntoBinaryTree {


        public TreeNode insertIntoBST(TreeNode root, int val) {

            if( root.right != null && val > root.val )
                insertIntoBST( root.right , val );

            if( root.left != null && val < root.val )
                insertIntoBST( root.left , val );

            if(root.left == null && val < root.val)
                root.left = new TreeNode(val);

            if(root.right == null && val > root.val)
                root.right = new TreeNode(val);

            return root;
        }

        class TreeNode {

            int val;
            TreeNode right;
            TreeNode left;

            TreeNode(int val) {
                this.val = val;
            }

        }
}
