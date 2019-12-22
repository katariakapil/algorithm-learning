package chapter3__QUEUE_STACK;

public class MyStack<T> {

    Node<T> top;
    Integer count =0;
    Integer capacity;

    public MyStack(int cap) {
        this.capacity = cap;
    }

    public boolean isFull(){

        return count == capacity;
    }

    public void push(T data) {

        Node<T> node = new Node<>(data);
        node.next = top;
        top = node;
        count++;
    }

    public T pop(){

        T item = top.data;
        top = top.next;
        count--;
        return item;
    }

    public T peek(){
        return top.data;
    }
    public boolean isEmpty(){

        return count == 0;
    }

    public Integer size() {
        return count;
    }

}



class Node<T> {

    T data;
    Node<T> next;

    public Node(T data) {
        this.data = data;
    }
}
