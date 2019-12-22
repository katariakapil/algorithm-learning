public class LargestIndex {

    public static void main(String[] args) {
        dominantIndex(new int[] {3, 6, 1, 0});
    }

    public static int dominantIndex(int[] nums) {

        int max = -1;
        int maxEl = nums[0];
        for (int i=1;i<nums.length;i++) {

            if (nums[i] > maxEl) {
                max = i;
                maxEl = nums[i];
            }

        }

        for (int i=0;i<nums.length;i++) {

            if (nums[i] != maxEl && nums[i]*2 > maxEl){
                return i;

            }
        }
        return max;
    }
}
