import java.util.Arrays;

public class RemoveDuplicateFromArray {

    public static void main(String[] args) {
        removeDuplicates(new int[]{1,3,3,4,4,4});
    }

    public static int removeDuplicates(int[] nums) {

        if (nums.length == 0) return 0;

        int i=0;//two pointer approch to reduce array
        for (int j=1;j<nums.length;j++) {

            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }

        int[] rs = Arrays.copyOfRange(nums, 0 , i+1);
        return i+1;
    }

}
