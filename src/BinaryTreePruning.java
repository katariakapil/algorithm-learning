public class BinaryTreePruning {


    static class Node {

        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {

        /*
        1,0,1,0,0,0,1
         */

        Node root = new Node(0);
        root.left = new Node(0);
        root.right = new Node(1);
        root.left.left = new Node(0);
        root.left.right  = new Node(0);


    }
}
