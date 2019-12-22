package bytebybyte;

public class IsBinarySearchTree {

    public static void main(String[] args) {


        Node<Integer> root = new Node(9);

        root.left = new Node(7);
        root.right = new Node<>(14);

       boolean rs = isBST(root, Integer.MIN_VALUE ,Integer.MAX_VALUE);

        System.out.println(rs);

    }

    static boolean isBST(Node<Integer> root, int min  , int max) {

        if (root == null) return true;


       if (root.val < min || root.val > max) return false;//

        return isBST(root.left, min, root.val) && isBST(root.right, root.val + 1, max);//add one for
    }


   static class Node<T>{

        Node<T> left;
        Node<T> right;
        T val;

        Node(T val){
            this.val = val;
        }
    }
}
