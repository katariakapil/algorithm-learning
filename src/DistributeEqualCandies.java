import java.util.*;

public class DistributeEqualCandies {


    public static void main(String[] args) {

       int rs = solution(new int[]{3, 4, 7, 7, 6, 6});
        System.out.println( "Result "+rs);

    }
    public static int solution(int[] T) {
        // write your code in Java SE 8

        Set<Integer> set = new HashSet();

        for (int i=0;i<T.length;i++){

           set.add(i);
        }


        return Math.min(T.length/2,set.size());
    }
}
