package bytebybyte;

public class ReverseLinkedList {


    public static void main(String[] args) {


        Node head = new Node(10);
        head.next = new Node(9);
        head.next.next = new Node(8);
        head.next.next.next = new Node(7);


        printReverseOrder(head);
        System.out.println( );

        Node node = reverseList(head);



        while (node!=null){
            System.out.println(node.val);
            node  = node.next;

        }

    }

    private static void printReverseOrder(Node node) {

        if (node == null) return;

        printReverseOrder(node.next);

        System.out.print(node.val+"  ");
    }

    private static Node reverseList(Node head) {

        Node curr = head;
        Node prev = null;

        while (curr !=null) {

            Node tmp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = tmp;

        }

        return prev;

    }


    static class Node {

        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }

    }


}
