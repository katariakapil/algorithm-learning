import java.util.HashMap;
import java.util.Map;

public class TwoSumNew {

    public static void main(String[] args) {


        int[] d = {1,33,24,5,25,26,5,8,9};
        int target = 10;

        Map<Integer,Integer> map = new HashMap<>();
        for (int i=0;i<d.length;i++){
            map.put(d[i], i);
        }

        for (int i=0;i<d.length;i++) {

            int lookup = target - d[i];
            //make sure they exists on same index
            if (map.get(lookup) != null && map.get(lookup) != i) {
                //found our value
                System.out.println(map.get(lookup) + ", " + i);
            }

        }
    }
}
