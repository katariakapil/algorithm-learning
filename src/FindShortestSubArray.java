import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class FindShortestSubArray {


    public static void main(String[] args) {

        /**
         * Given a non-empty array of non-negative integers nums, the degree of this array is defined as the maximum
         * frequency of any one of its elements.
         *
         * Your task is to find the smallest possible length of a (contiguous) subarray of nums, that has the same degree as nums.
         */

        //int[] data  = {1, 2, 2, 3, 1};
        int[] data = {1,2,2,3,1,4,2};

        Map<Integer,Integer> left = new HashMap<>();
        Map<Integer,Integer> right = new HashMap<>();
        Map<Integer,Integer> count = new HashMap<>();

        for (int i=0;i<data.length;i++) {

            if (left.get(data[i]) == null) //to track left index of element
                left.put(data[i], i);

            right.put(data[i],i); // to track right index of element

            count.put(data[i], count.getOrDefault(data[i], 0)+1);

        }

        int ans = data.length;

        int degree  = Collections.max(count.values()); //get the max value from values

        System.out.println("Degree "+degree);

        for (int x: count.keySet()){

            if (count.get(x) == degree){
                System.out.println("val is "+x);
                ans = Math.min(ans, right.get(x) - left.get(x) + 1);
            }

        }

        System.out.println(ans);



    }

}
