import java.util.HashMap;

public class FindMaxSumCons {
    public static void main(String[] args) {

        int[] d = {5, 3, 99, 1, 4, 100};

        /**
         *
         * Find the max length of sub sequence consecutive integers..
         * 1, 2, 3 ,4, 5   or 99, 100
         *
         *
         * Look for value + 1 and -1 for sequence and append to its sub sequence
         *
         *
         */

        boolean[] visited = new boolean[d.length]; //keep track of visted elements.

        HashMap<Integer, Integer> map = new HashMap<>();

        int k = 0;
        for (int i : d) {
            map.put(i, k );
            k++;
        }

        int max = 0, len = 0;

        for (int i=0;i<d.length;i++) {

            //if not visted time to look up
            if (!visited[i]) {
                visited[i] = true;
                int fwd = d[i] + 1;

                while (map.containsKey(fwd)) {
                    visited[map.get(fwd)] = true;
                    len++;
                    fwd++;
                }

                int back = d[i] -1;

                while (map.containsKey(back)) {
                    visited[map.get(back)] = true;
                    len++;
                    back--;
                }

                max = Math.max(max, len);

            }
        }
        System.out.println(" Max " + max);

    }
}
