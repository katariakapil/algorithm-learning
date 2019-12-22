package chapter3__QUEUE_STACK;

import java.util.Stack;

public class MyStackQueue {

    Stack<Integer> newest;
    Stack<Integer> oldest;

    public void MyStackQueue() {

        newest = new Stack();
        oldest = new Stack();

    }

    public void enqueue(Integer element) {
      newest.push(element);
    }

    public Integer dequeue() {
        shiftStacks();
        return oldest.pop();
    }

    /**
     * move element from newest to oldest so we can remove from oldest first maintains FIFO
     */
    private void shiftStacks() {
        if (oldest.isEmpty()) {
            while(!newest.isEmpty()) {
                oldest.push(newest.pop());
            }
        }
    }
}
