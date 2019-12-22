package bytebybyte;

import java.util.Stack;

public class SortStack {

    public static void main(String[] args) {

        Stack<Integer> st = new Stack();

        st.push(1);
        st.push(4);
        st.push(3);
        st.push(2);
        st.push(5);

        //now sort this stack using only one additional stack.
        /**
         *
         *
         *     3
         *     4   2
         *     1   5
         *     _   _
         */

        Stack<Integer> newStack = new Stack<>();

        newStack.push(st.pop());// add the first element from main stack.

        //lets get the element from main until its empty
        while (!st.isEmpty()) {

           int temp = st.pop();
            while (!newStack.isEmpty() && temp > newStack.peek()) {
                st.push(newStack.pop());
            }
            newStack.push(temp);

        }

        while(!newStack.isEmpty()) {
            System.out.print(newStack.pop() + " ");

        }

    }
}
