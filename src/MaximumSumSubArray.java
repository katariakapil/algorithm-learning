public class MaximumSumSubArray {

    public static void main(String[] args) {
        /**
         * Brute force to get sum
         * Given an array of positive numbers and a positive number ‘k’, find the maximum sum of any contiguous
         * subarray of size ‘k’.
         */

        int[] ar  = {2, 1, 5, 1, 3, 2};
        int k = 3;
        int maxSum  = 0;
        int sum =0 ;

        maxSum = getMaxSumBruteForce(ar, k, maxSum);

        System.out.println(maxSum);
        /**
         * sliding window to calculate sum.
         */
        int start = 0;
        int maxSumNew = 0;
        for (int i=0;i<ar.length;i++){

            sum += ar[i];

            if (i > k -1) { // here we add first 3 (k) then keep sliding next
                maxSumNew = Math.max(maxSumNew, sum);
                sum -= ar[start];
                start++;
            }
        }

        System.out.println(maxSumNew);

    }

    private static int getMaxSumBruteForce(int[] ar, int k, int maxSum) {
        int sum;
        for (int i = 0; i<=ar.length - k ; i++) {
            sum = 0;
            for (int j =i;j<i+k;j++) {
                sum+=ar[j];
            }
            maxSum = Math.max(sum, maxSum);
        }
        return maxSum;
    }
}
