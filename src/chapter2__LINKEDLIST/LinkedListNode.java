package chapter2__LINKEDLIST;


public class LinkedListNode<T> {

    Node head;

    LinkedListNode() { }

    public void add(LinkedListNode list,T data) {

        Node newNode = new Node(data);
        newNode.next = null;

        if (list.head == null) { //head is null here
            list.head = newNode;

        } else {
            //now traverse to end and append
            Node last = list.head;
            while (last.next!=null) {
                last = last.next;
            }
            last.next = newNode;
        }
    }

    public void print(Node node) {

        if (node == null) return;

        Node temp = node;
        while (temp != null) {

            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static LinkedListNode dummyList() {
        LinkedListNode list = new LinkedListNode();


        list.add(list,1);
        list.add(list,2);
        list.add(list,3);
        list.add(list,4);
        list.add(list,5);
        list.add(list,2);
        list.add(list,6);

        return list;
    }

}
