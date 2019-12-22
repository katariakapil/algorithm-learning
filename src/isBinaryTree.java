public class isBinaryTree {

    public static void main(String[] args) {
        //check if tree is binary tree or not

        Node node = new Node();
        node.val = 5;
        node.left = new Node();
        node.left.val = 4;
        node.right = new Node();
        node.right.val = 7;

        boolean rs = isBinary(node, Integer.MIN_VALUE, Integer.MAX_VALUE);

        System.out.println(rs);

    }

    private static boolean isBinary(Node node, int min, int max) {

        if (node == null) return true;

        if (node.val < min || node.val > max) return false;//now we went out of range and broke BST property

        return isBinary(node.left, min , node.val) && isBinary(node.right, node.val+ 1 , max);
    }

    static class Node{

        int val;
        Node left;
        Node right;
    }
}
