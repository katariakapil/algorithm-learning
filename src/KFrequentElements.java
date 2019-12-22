import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class KFrequentElements {

    public static void main(String[] args) {


        int[] d = {1,1,3,3,4,4};
        int k = 2;

       Set<Integer> set = new HashSet<>();

        Map<Integer, Integer> map = new HashMap<>();

        for (int i: d) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for (Map.Entry<Integer,Integer> entry: map.entrySet()) {

            if (entry.getValue() == k) {
                set.add(entry.getKey());
            }
        }
        System.out.println(set);
    }
}
