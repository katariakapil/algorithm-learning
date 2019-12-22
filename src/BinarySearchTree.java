import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {

    static Node root;

        // Function to insert nodes in level order
        public Node insertLevelOrder(int[] arr, Node root, int i)
        {
            // Base case for recursion
            if (i < arr.length) {
                Node temp = new Node(arr[i]);
                root = temp;

                // insert left child
                root.left = insertLevelOrder(arr, root.left,
                        2 * i + 1);

                // insert right child
                root.right = insertLevelOrder(arr, root.right,
                        2 * i + 2);
            }
            return root;
        }

        // Function to print tree nodes in InOrder fashion
        public void inOrder(Node root)
        {
            if (root != null) {
                inOrder(root.left);
                System.out.print(root.data + " ");
                inOrder(root.right);
            }
        }

        // Driver program to test above function
        public static void main(String args[])
        {
            BinarySearchTree t2 = new BinarySearchTree();
            int arr[] = { 1, 2, 3, 4, 5, 6 };
            t2.root = t2.insertLevelOrder(arr, t2.root, 0);
            t2.inOrder(t2.root);
        }

        static class Node<T>{

        T data;
        Node<T> left;
        Node<T> right;

        public Node(T data){
            this.data = data;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        public Node<T> getLeft() {
            return left;
        }

        public void setLeft(Node<T> left) {
            this.left = left;
        }

        public Node<T> getRight() {
            return right;
        }

        public void setRight(Node<T> right) {
            this.right = right;
        }
    }
}
