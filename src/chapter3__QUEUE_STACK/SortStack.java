package chapter3__QUEUE_STACK;

import java.util.Stack;

public class SortStack {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack();

        stack.push(2);
        stack.push(22);
        stack.push(12);
        stack.push(52);
     //   stack.push(62);
       // stack.push(42);
        //stack.push(24);
        //stack.push(26);

        //now sort this stack using only on additional stack


        Stack<Integer> second = new Stack<>();
        while (!stack.isEmpty())
       {
           int temp = stack.pop();
          // System.out.println(temp);
           while (!second.isEmpty()  &&  second.peek() > temp ) {
                stack.push(second.pop());
            }
            second.push(temp);
        }

        while (!second.isEmpty()) { //copy back rest element
            stack.push(second.pop());
        }

        while(!stack.isEmpty()) {
            System.out.println(stack.pop());
        }


    }
}
