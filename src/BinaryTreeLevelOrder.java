import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrder {

    Node root;

    /* Class to represent Tree node */
    static class Node {
        int data;
        Node left, right;

        public Node(int item) {
            data = item;
            left = null;
            right = null;
        }
    }

    public static void main(String args[])
    {
        /* creating a binary tree and entering
         the nodes */
        BinaryTreeLevelOrder tree_level = new BinaryTreeLevelOrder();
        tree_level.root = new Node(1);
        tree_level.root.left = new Node(2);
        tree_level.root.right = new Node(3);
        tree_level.root.left.left = new Node(4);
        tree_level.root.left.right = new Node(5);

        System.out.println("Level order traversal of binary tree is - ");
        tree_level.printLevelOrder();
    }

    private void printLevelOrder() {

        Queue<Node> queue  = new LinkedList<>();
        List<Double> rs = new ArrayList<>();

        queue.offer(this.root);

        while(!queue.isEmpty()) {


            double sum =0;
            int size = queue.size();
            for (int i=0;i<queue.size();i++){

                Node temp = queue.poll();
                sum += temp.data;

                if (temp.left != null){
                    queue.add(temp.left);
                }
                if (temp.right != null){
                    queue.add(temp.right);
                }

            }

            rs.add(sum/size);
        }
    }
}
