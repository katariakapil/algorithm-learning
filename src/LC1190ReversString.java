import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class LC1190ReversString {


    public static void main(String[] args) {

        //reverse string between parentheses

        String s = "(ed(et(oc))el)";


        Stack<Character> stack = new Stack();

        char[] ch = s.toCharArray();

        for (char c : ch) {

            if (c != ')') {
                stack.push(c);// keep adding to stack until you got the closing bracket.
            }   else {
                Queue<Character> queue  = new LinkedList<>();
                while (stack.peek() != '(') {
                    queue.offer(stack.pop());
                }
                stack.pop();
                while(!queue.isEmpty()) {
                    //keep adding back to stack from queue
                    stack.push(queue.poll());
                }
            }
        }

        //Now start building our string backwards.

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty())
        sb.append(stack.pop()+"");

        System.out.println(sb.toString());

        System.out.println(sb.reverse());
    }
}
