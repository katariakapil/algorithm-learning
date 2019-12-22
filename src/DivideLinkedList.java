public class DivideLinkedList {

    public static void main(String[] args) {


        DivideLinkedList list = new DivideLinkedList();

        Node n = new Node(1);
        n.next= new Node(2);
        n.next.next= new Node(3);
        n.next.next.next= new Node(4);
        n.next.next.next.next = new Node(5);


        Node curr = n;
        Node fast = n;
        while(curr != null && fast.next !=null) {

            curr  = curr.next;
            fast = fast.next.next;
            System.out.println("Current "+curr.val);
            System.out.println("Fast "+fast.val);
        }

        System.out.println("\n\n");

        while (curr !=null) {
            System.out.println(curr.val);
            curr = curr.next;
        }
    }


    static class Node {

        Node next;
        Integer val;

        public Node(Integer val){
            this.val = val;
        }

    }

}


