import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class DifferenceBetweenArrays {

    public static void main(String[] args) {

        int[] a = {2,4,5,7,8,9,20,23};
        int[] b = {2,5,6,7,8,9};

        if(a.length > b.length) {
            getDiff(a,b);
        } else {
            getDiff(b,a);
        }


    }

    private static void getDiff(int[] big, int[] small) {


        Set<Integer> bigSet = new HashSet(Arrays.asList(big));
        Set<Integer> smallSet = new HashSet(Arrays.asList(small));
        Set<Integer> result = new HashSet(bigSet);

        for (Integer i : smallSet) {

            if (!result.add(i)){
                result.remove(i);
            }

        }

        for (int i:result) {
            System.out.println(i);
        }

    }


}
