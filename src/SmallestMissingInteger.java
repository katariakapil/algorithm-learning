import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class SmallestMissingInteger {
    public static void main(String[] args) {
/**
 * 1. Given an unsorted integer array, find the smallest missing positive integer.
 *
 * [1,2,0] -> 3
 * [2,3,4] -> 1
 * '''
 */

        int[] a  = {2,3,4};
        //int[] a  = {0,1,2};

        Set<Integer> set = new HashSet<>();

        for (int i:a) {
            if (i > 0)
                set.add(i);
        }

        for (int i=1;i<a.length+1;i++) {

            if (!set.contains(i)) {
                System.out.println(i);
                break;
            }
        }

        System.out.println();
    }
}
