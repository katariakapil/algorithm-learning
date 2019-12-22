import java.util.HashSet;
import java.util.Set;

public class FairCandySwap {

    public static void main(String[] args) {

        //swap candies so that there sum remain same.

        int[] a = {1,2};
        int[] b = {2,3};

        //after swap they should have same sum of candies.
        int suma = 0 , sumb = 0;
        Set<Integer> set = new HashSet<>();
        for (int i:a){
            suma += i;
        }
        for (int i:b){
            sumb += i; set.add(i);
        }
        int delta = (sumb - suma)/2;
        //2

        for (int i: a) {

            if (set.contains(i + delta)){ // val + delta exist in second array then we can swap to balance.

                System.out.println(i  + " , " + (delta+i));

            }
        }



    }
}
