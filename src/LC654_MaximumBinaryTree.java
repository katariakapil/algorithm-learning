public class LC654_MaximumBinaryTree {

    static class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int d) {
            this.val=d;
        }
    }

    public static void main(String[] args) {

        int[] data = {3,2,1,6,0,5};
        TreeNode root = constructMaximumBinaryTree(data, 0, data.length -1);


    }

    private static TreeNode constructMaximumBinaryTree(int[] data, int l, int r) {

        if (l == r) return null;

        int max = getMax(data, l, r);

        TreeNode root = new TreeNode(data[max]);
        root.left = constructMaximumBinaryTree(data,l,max);
        root.right = constructMaximumBinaryTree(data,max+1,r);


        return root;
    }

    private static int getMax(int[] data, int l, int r) {

        int max = l;

        for (int i=0;i<data.length;i++) {
            max = Math.max(data[i],data[max]);
        }
        return max;
    }
}
