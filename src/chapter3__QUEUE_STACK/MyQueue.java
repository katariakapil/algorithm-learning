package chapter3__QUEUE_STACK;

public class MyQueue<T> {

    Node<T> first;
    Node<T> last;

    public void enqueue(T data) {

        Node<T> newNode = new Node<>(data);
        if (last != null) {
            last.next = newNode;
        }
        last = newNode;
        if (first == null)
            first = last;
    }

    public T dequeue() throws Exception{

        if (first == null) throw new Exception("Queue is empty");

       T data = first.data;
       first = first.next;
       if (first == null) last = null;
       return data;
    }

    public T peek() throws Exception{
        if (first == null) throw new Exception("Queue is empty");
        return first.data;//return first element
    }

    public boolean isEmpty() {
        return first == null;
    }

}

