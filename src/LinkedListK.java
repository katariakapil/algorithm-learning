
public class LinkedListK  {

    Node head;
    int count;

    public LinkedListK(Node head) {
        this.head = head;
    }
    public LinkedListK() {
        this.head = null;
    }

    @Override
    public String toString() {
        return "LinkedListK{" +
                "head=" + head +
                ", count=" + count +
                '}';
    }

    public void add(int data) {
        if (head == null) {
            head = new Node(data);
        }
        Node temp = head;
        while (temp != null && temp.next != null) {

            temp = temp.next;
        }
        head.next = new Node(data);
        count++;
    }

    public int get(int index){
        int n = -1;
        Node temp = head;
        for (int i=1;i<index;i++) {
            temp = temp.next;
        }

        return (int)temp.data;
    }
    public boolean isEmpty(){

        return head == null;
    }
    public int size() {
        return count;
    }


    public void remove(){

    }
    public static void main(String[] args) {

        LinkedListK k = new LinkedListK();
        k.add(2);
        k.add(9);
        k.add(3);

        System.out.println(k.toString());

    }


    static class  Node<T> {
        T data;
        Node next;
        public Node(T data) {
            this.data = data;
        }
    }
}
