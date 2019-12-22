import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FrequencyQueriesHackerRank {

    public static void main(String[] args) {

        /**
         * 8
         * 1 5
         * 1 6
         * 3 2
         * 1 10
         * 1 10
         * 1 6
         * 2 5
         * 3 2
         */
        List<int[]> queries = new ArrayList<>();





        queries.add(new int[]{1,5});
        queries.add(new int[]{1,6});
        queries.add(new int[]{3,2});
        queries.add(new int[]{1,10});
        queries.add(new int[]{1,10});
        queries.add(new int[]{3,2});







        freqQuery(queries);
    }
    // Complete the freqQuery function below.
    static List<Integer> freqQuery(List<int[]> queries) {

        List<Integer> rs = new ArrayList();
        List<Integer> collect = new ArrayList();
        HashMap<Integer,Integer> map = new HashMap<>();
        HashMap<Integer,Integer> freq = new HashMap<>();


        for (int[] ar : queries) {

            System.out.println(ar[0] + " = " + ar[1]);
            System.out.println(">><<<");

            if (ar[0] == 1) {
                collect.add(ar[1]);
                map.put(ar[1], map.getOrDefault(ar[1],0)+1);
                if (map.get(ar[1]) != null && map.get(ar[1]) == ar[1] ) {
                    int fr = map.get(ar[1]);
                    freq.put(fr+1, ar[1]);
                }

            }
            if (ar[0] == 3) {
                if (freq.get(ar[1]) != null  && freq.containsKey(ar[1])) {
                    System.out.println("PRINT 1");
                }
            }
        }


        return null;
    }


}
