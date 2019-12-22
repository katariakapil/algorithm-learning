import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountTriplets
{

    // 5 - is R
    //1 5 5 25 125
    // 4 output
    //(0,1,3) (0,2,3) (1,3,4) (2,3,4)

    public static void main(String[] args) {
        ArrayList<Long> al = new ArrayList<>();
        al.add(1L);
        al.add(5L);
        al.add(5L);
        al.add(25L);
        al.add(125L);
        System.out.println(countTriplets(al,5));
    }

    private static long countTriplets(List<Long> arr, long r) {
        Map<Long, Long> potential = new HashMap<>();
        Map<Long, Long> counter = new HashMap<>();
        long count = 0;
        for (int i = 0; i < arr.size(); i++) {
            long a = arr.get(i);
            long key = a / r;

            if (counter.containsKey(key) && a % r == 0) {
                count += counter.get(key);
            }

            if (potential.containsKey(key) && a % r == 0) {
                long c = potential.get(key);
                counter.put(a, counter.getOrDefault(a, 0L) + c);
            }

            potential.put(a, potential.getOrDefault(a, 0L) + 1);
            // Every number can be the start of a triplet.
        }
        return count;
    }

}
