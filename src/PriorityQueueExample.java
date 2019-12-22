import sun.font.CCompositeGlyphMapper;

import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueExample {


    public static void main(String[] args) {



        int [] data = {2,7,4,1,8,1};

        lastStoneWeight(data);

        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());

        queue.add(2);

        queue.add(1);

        queue.add(7);

        while(!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }

    private static int lastStoneWeight(int[] data) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());

        for (int i:data) {
            queue.offer(i);
        }

        while(!queue.isEmpty()) {

            int first = queue.poll();
            if (queue.peek() == null)
            {
                return first;
            }
            queue.offer(first - queue.poll());
        }

        return 0;
    }
}
