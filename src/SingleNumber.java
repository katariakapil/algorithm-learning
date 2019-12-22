public class SingleNumber {

    public static void main(String[] args) {

        System.out.println(singleNumber(new int[] {2,2,5,5,3,6,6}));
    }


    public static int singleNumber(int[] nums) {
        int ans =0;

        int len = nums.length;
        for(int i=0;i!=len;i++) {

            ans ^= nums[i];
        }
        return ans;

    }


}
