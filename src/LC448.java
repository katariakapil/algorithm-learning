import java.util.ArrayList;
import java.util.List;

public class LC448 {
    public static void main(String[] args) {

        int[] ar = {4,3,2,7,8,2,3,1};
        findDisappearedNumbers(ar);
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {

        for(int i=0;i<nums.length;i++)
        {
            int j= Math.abs(nums[i]) - 1;
            System.out.println("j"+j);

            nums[j]=-1*Math.abs(nums[j]); //make negative
        }

        System.out.println(nums);

        List<Integer> res = new ArrayList<>();

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>0){
                res.add(i+1);
            }
        }
        return res;
    }
}
