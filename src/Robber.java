public class Robber {

    public static void main(String[] args) {

        rob(new int[]{2,7,9,3,1});
    }

    public static int rob(int[] nums) {

        int odd = 0;

        int even = 0 ;

        if (nums.length > 1) {
            even = nums[0];
        }
        if (nums.length > 2) {
            odd = nums[1];
        }

        for (int i=2;i<nums.length;i++) {

            if (i/2 == 0) {

                even += nums[i];
            } else {
                odd += nums[i];
            }

        }
        return Math.max(even,odd);

    }
}
