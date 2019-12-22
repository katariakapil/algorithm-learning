package chapter3__QUEUE_STACK;

import java.util.ArrayList;

public class SetofStacks<T> {

    int capacity = 3;

    ArrayList<MyStack> list = new ArrayList();

    /*
    Push element to stack of stacks
     */
    public void push (T data) {

        MyStack<T> last = getLastStack();
        if (last != null && !last.isFull()) {
            last.push(data);
        } else {
            MyStack<T> stack = new MyStack<>(capacity);
            stack.push(data);
            list.add(stack);
        }
    }

    private MyStack<T> getLastStack() {

        if (list.size() == 0) return null;

        return list.get(list.size() - 1);
    }

    public static void main(String[] args) {
        SetofStacks st = new SetofStacks();

        int i=0;
        while (i < 10)
        {
            i++;
            st.push(i);
        }

        System.out.println(st.toString());

    }


}
