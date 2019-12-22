public class TwoSum {

    public static void main(String[] args) {

        /**
         * Given an array of integers that is already sorted in ascending order, find two numbers such that they add up
         * to a specific target number. The function twoSum should return indices of the two numbers such that they add
         * up to the target, where index1 must be less than index2.
         *
         */
        int[] rs = twoSum(new int[]{2,7,11,15}, 9);

        System.out.println(rs[0] + " , " + rs[1]);
    }

    public static int[] twoSum(int[] num, int target) {

        int i=0;// begin
        int j=num.length -1;// end

        while (i < j){

            int sum = num[i] + num[j];

            if (sum == target) {
                return new int[]{i, j};//add extra one for 1 base index
            }
            else if (sum < target) {
                i++;//move to right side
            } else {
                j--;//move to left side
            }

        }
        return null;
    }
}
