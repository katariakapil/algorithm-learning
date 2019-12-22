public class MergeTreeNodes {

    public TreeNode mergeTrees(TreeNode<Integer> t1, TreeNode<Integer> t2) {

        if (t1 == null && t2 == null) return null;

        int t1Result = ( t1 == null ? 0 : t1.val);
        int t2Result = (t2 == null ? 0 : t2.val);

        TreeNode newNode = new TreeNode(t1Result + t2Result);

        newNode.left = mergeTrees(t1 == null ? null : t1.left , t2 == null ? null : t2.left);
        newNode.right = mergeTrees(t1 == null ? null : t1.right , t2 == null ? null : t2.right);

        return newNode;


    }

    public class TreeNode<T> {

        T val;
        TreeNode left;
        TreeNode right;

        public TreeNode(T val) {
            this.val = val;
        }
    }
}
