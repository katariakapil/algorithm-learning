import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PreOrderTraversal {


    static class Node<T> {

        Node left;
        Node right;
        T data;

        public Node(T data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {


        Node<Integer> root = new Node(10);

        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node (40);
        root.left.right = new Node(50);
        root.right.left = new Node(60);
        root.right.right = new Node(70);

        /*
           10
        /       \
       20       30
      / \       /  \
    40   50    60   70


     */

        //preOrderTraversal(root);
      /*  for (TreeTraversalEnum s: TreeTraversalEnum.values()) {
            System.out.println(s.desc);
        }
        bfs(root);

        preOrderTraversalIter(root);

       */

        inOrderTraversalIter(root);
    }


    private static void inOrderTraversalIter(Node<Integer> root) {

        if (root ==null) return;

        Stack<Node> stack = new Stack();
        Node curr = root;

        // check here till current is not null OR  stack is not empty
        // we will add elements to stack as we go along

        while (curr != null || stack.size() > 0) {

            while (curr != null) {

                stack.push(curr);// add current element to stack and keep going
                curr = curr.left;

            }
            curr = stack.pop(); //left most element now pop out
            System.out.println(curr.data);
            curr = curr.right;
        }
    }

    private static void preOrderTraversalIter(Node<Integer> root) {

        if (root ==null) return;

        Stack<Node> stack = new Stack();
        stack.push(root);

        while(!stack.isEmpty()) {

            Node<Integer> node = stack.pop();
            System.out.println(node.data);
            // Add Right first since LIFO is there we need left out first
            if (node.right !=null) {
                stack.push(node.right);
            }
            if (node.left !=null) {
                stack.push(node.left);
            }
        }

    }

    private static void bfs(Node<Integer> root) {

        Queue<Node> queue = new LinkedList<>();

        queue.offer(root);

        while (!queue.isEmpty()) {

            Node<Integer> node = queue.poll();
            System.out.println(node.data); //print data now

            if (node.left !=null ) {
                queue.offer(node.left);
            }
            if (node.right != null) {
                queue.offer(node.right);
            }
        }
    }

    private static void preOrderTraversal(Node<Integer> root) {

        if (root == null) return;
        System.out.println(root.data);

        preOrderTraversal(root.left);
        preOrderTraversal(root.right);

    }
}
