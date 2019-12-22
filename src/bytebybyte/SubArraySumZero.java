package bytebybyte;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SubArraySumZero {

    public static void main(String[] args) {

        int [] ar = {1, 2, -5, 1, 2, -1};

        int target = 0;

        zeroSumBruteForce(ar, target);

       int [] arr = zeroSumOptimize(ar, target);

       for (int i:arr){
           System.out.print(i+" ");

       }
    }

    // we need to see if we are getting same number again after adding sum means we have reached zero at
    //some point of time and we just indexes now from old index to new index
    private static int[] zeroSumOptimize(int[] ar, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        int sum = 0;
        for (int i=0;i<ar.length;i++) {

            Integer oldindex = map.get(sum);
            if (map.get(sum) == null) {
                map.put(sum, i);
                sum += ar[i];
            } else {
                System.out.println("Indexes " + oldindex + " i " + i);
                return Arrays.copyOfRange(ar, oldindex, i);
            }
        }

        return null;
    }

    private static void zeroSumBruteForce(int[] ar, int target) {
        for (int i =0;i<ar.length;i++) {

            int sum  =  ar[i];
            for (int j=i+1;j<ar.length -1;j++) {

                 sum += ar[j];

                 if (sum == target){

                     System.out.println("i = "+ i+" j "+j);
                     break;
                 }
            }
        }
    }
}
