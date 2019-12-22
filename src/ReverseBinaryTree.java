import java.util.LinkedList;
import java.util.Queue;

public class ReverseBinaryTree {

   static class Node {

        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
   }

    public static void main(String[] args) {

       Node n  = new Node(8);
       n.left = new Node(5);
       n.right = new Node(10);
       n.left.left = new Node(2);
       n.right.right = new Node(18);
       traverse(n);
        System.out.println("\n\n");
      // reverse(n);
        reverseIter(n);
       traverse(n);
    }

    private static void traverse(Node n) {

       if (n == null) return;
        traverse(n.left);
        System.out.println(n.data);
        traverse(n.right);
    }

    private static Node reverse(Node n) {
        if (n == null) return null;
        Node temp = n.right;
        n.right = reverse(n.left);
        n.left = reverse(temp);
        return n;
    }

    private static Node reverseIter(Node n) {

       Queue<Node> queue = new LinkedList<>();

       queue.add(n);

       while(!queue.isEmpty()) {
           Node current = queue.poll();
           Node temp = current.left;
           current.left = current.right;
           current.right = temp;

           if (current.left != null)  queue.add(current.left);
           if (current.right != null) queue.add(current.right);

       }
       return n;
    }


}
