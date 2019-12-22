public class SmallestSumArray {

    public static void main(String[] args) {

        /**
         * Given an array of positive numbers and a positive number ‘S’, find the length of the smallest subarray whose
         * sum is greater than or equal to ‘S’. Return 0, if no such subarray exists.
         *
         * Solution sliding window.
         */
        int[] data = {2, 1, 5, 2, 3, 2};
        int sum = 7;
        int windowSum=0;
        int start=0;
        int minLen=Integer.MAX_VALUE;
        for (int i=0;i<data.length;i++){

            windowSum += data[i];

            while (windowSum >= sum) {

                minLen = Math.min( minLen, i - start + 1);
                windowSum -= data[start];
                start++;

            }
        }

        System.out.println(minLen);
    }
}
