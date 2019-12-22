package chapter2__LINKEDLIST;

public class KthElementToLast {

    public static void main(String[] args) {


        //return the kth element to last from linked list.

        int k = 4;

        LinkedListNode list  = LinkedListNode.dummyList();


        //return the 3rd last element from list

        // run one list to k element
        // run second list from first list
        // when first list reach end
        // return the element from second list

        // L1 = 3
        // L2 = L2 - L1


        Node n1 = list.head;
        Node n2 = list.head;

        for (int i=0;i<k;i++) {

            if (n1 == null)return;
            n1 =n1.next;
        }

        while (n1!=null) {

            n1 = n1.next;
            n2 = n2.next;

        }
        System.out.println(n2.data);
    }
}
