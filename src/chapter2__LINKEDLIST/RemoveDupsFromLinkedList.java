package chapter2__LINKEDLIST;

import java.util.HashSet;

public class RemoveDupsFromLinkedList {
    public static void main(String[] args) {


        LinkedListNode list = LinkedListNode.dummyList();


        list.print(list.head);

       // removeDups(list);
        System.out.println("\n\n\n");

        removeDupsWithoutExtraMemory(list);
        list.print(list.head);

    }


    private static void removeDupsWithoutExtraMemory(LinkedListNode list) {

        Node<Integer> current = list.head;

        while (current != null) {

            Node<Integer> runner = current;
            while(runner.next !=null) {

                //time to remove by checking next element
                if (runner.next.data == current.data) {
                    runner.next = runner.next.next;
                } else {
                    runner = runner.next;
                }

            }
            current = current.next;
        }
    }

    private static void removeDups(LinkedListNode list) {

        HashSet<Integer> set = new HashSet<>();
        Node<Integer> n = list.head;
        Node<Integer> temp = list.head;

        while (n!=null) {

            if (set.contains(n.data)) {
                temp.next = n.next;

            }
            else {
                set.add(n.data);
                temp = n;
            }
            n = n.next;
        }

    }
}
