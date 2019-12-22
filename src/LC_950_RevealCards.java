import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class LC_950_RevealCards {

    public static void main(String[] args) {


        int[] data = {17,13,11,2,3,5,7};

        int[] rs = revealCards(data);
    }

    private static int[] revealCards(int[] data) {

        int[] rs = new int[data.length];

        Deque<Integer> que = new LinkedList<>();

        for (int i=0;i<data.length;i++) {
            que.add(i);

        }
        Arrays.sort(data);

        for (int card:data){

           rs[ que.pollFirst()] = card;
           if (!que.isEmpty())
               que.add(que.pollFirst());

        }



        return rs;

    }
}
