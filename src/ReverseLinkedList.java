import java.util.List;

public class ReverseLinkedList {

    static class ListNode {
            int val;
            ListNode next;
            ListNode(int val) {
                this.val = val;
            }
    }

    public static void main(String[] args) {

        ListNode a = new ListNode(5);
        ListNode b = new ListNode(4);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(2);
        ListNode e = new ListNode(1);


       a.next = b;
       b.next = c;
       c.next = d;
       d.next = e;

        print(a);

        System.out.println("  \n ");

        //now reverse linked list
        ListNode reverse = a;
        ListNode prev=null;
        ListNode next =null;
       while (reverse != null) {

           next = reverse.next;
           reverse.next = prev;
           prev = reverse;
           reverse = next;
       }

       a = prev;

        print(a);

    }

    private static void print(ListNode a) {
        //loop through linked list
        ListNode current = a;
        while(current != null) {

            System.out.println(current.val);
            current = current.next;

        }
    }


}
/*
public ListNode reverseList(ListNode head) {
        ListNode current = head;
        ListNode prev = null;
        ListNode next;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        head = prev;

        return head;
    }
 */