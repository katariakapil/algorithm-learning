import java.util.Arrays;

public class MoveZeros {


    public static void main(String[] args) {

        moveZeroes1(new int[]{0,1,0,3,12});
    }
    public static void moveZeroes1(int[] nums) {

        int i=0;
        for (int n : nums){

            if (n!=0){
                nums[i++] = n;
            }
        }

        Arrays.fill(nums,i,nums.length, 0);

        for (int k:nums) {
            System.out.print(k);
        }
    }


    public static void moveZeroes(int[] nums) {
        int zeroCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeroCount++;
            } else if (zeroCount > 0) {
                //swap with zero that is zeroCount to the left
                swap(nums, i, i - zeroCount);
            }
        }
    }

    public static void swap(int[] nums, int l, int r) {

        int temp = nums[l];
        nums[l] = nums[r];
        nums[r] = temp;
    }


}
