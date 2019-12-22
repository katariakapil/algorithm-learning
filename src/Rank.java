import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Rank {

    public static void main(String[] args) {
      String[] rs =   findRelativeRanks(new int[]{10,3,8,9,4});

      for(String s:rs) {
          System.out.print(s + " , ");

      }
    }

    public static String[] findRelativeRanks(int[] nums) {

        int n = nums.length;
        int[] temp = nums.clone();
        String[] res = new String[n];

        Arrays.sort(temp);
        Map<Integer,String> map = new HashMap();

        if(n>=1) map.put(temp[n-1], "Gold Medal"); // assign element at last index as Gold
        if(n>=2) map.put(temp[n-2], "Silver Medal");
        if(n>=3) map.put(temp[n-3], "Bronze Medal");

        for (int i=0;i<n - 3 && n>=4;i++){
            map.put(temp[i],n-i+"");
        }

        for (int i=0;i<nums.length;i++){
            res[i] = map.get(nums[i]);
        }

        return res;
    }

}