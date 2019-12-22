import java.util.LinkedList;

public class MyStack<T> {

    LinkedList<T> list = new LinkedList();

    public MyStack() {
    }

    public int size() {
        return list.size();
    }

    public boolean isEmpty(){
        return list.size() == 0;
    }

    public T peek() {

       return list.peekLast();
    }

    public void push(T data) {

        list.addLast(data);
    }

    public void pop() {

        list.removeLast();
    }

    @Override
    public String toString() {
        return "MyStack{" +
                "list=" + list +
                '}';
    }

    public static void main(String[] args) {

        MyStack<Integer> stack = new MyStack<>();

        //LIFO
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);

        System.out.println(stack);

        while (!stack.isEmpty()) {
            System.out.println(stack.peek());
            stack.pop();
        }

    }


}
