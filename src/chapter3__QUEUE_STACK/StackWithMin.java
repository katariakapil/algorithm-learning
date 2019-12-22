package chapter3__QUEUE_STACK;

import java.util.Stack;

public class StackWithMin extends Stack<Integer>  {

    Stack<Integer> s2;

    StackWithMin() {
        s2 = new Stack<Integer>();
    }

    public void push (int data) {
        if (data <= min()) {
            s2.push(data);
        }
        super.push(data);
    }

    public Integer pop(){
        int val =  super.pop();
        if (val == min())//if min is being popped we need to remove from our min stack as well
            s2.pop();
        return val;

    }
    private int min() {
        if (s2.isEmpty()) {
            return Integer.MAX_VALUE;
        } else {
         return  s2.peek();
        }
    }
}
