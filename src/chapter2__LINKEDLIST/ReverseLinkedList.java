package chapter2__LINKEDLIST;

public class ReverseLinkedList {

    public static void main(String[] args) {

        LinkedListNode list = LinkedListNode.dummyList();

        //list.head;

        Node<Integer> listtoreverse = list.head.next;
        Node<Integer> reverted = list.head;
        reverted.next = null;

        while (listtoreverse!=null) {

            Node temp = listtoreverse;

            listtoreverse = listtoreverse.next;

            temp.next = reverted;
            reverted = temp;

        }

        print(reverted);

    }


    public static void print(Node node) {

        if (node == null) return;

        Node temp = node;
        while (temp != null) {

            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
