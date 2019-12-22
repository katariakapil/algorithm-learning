public class LC1043 {

    public static void main(String[] args) {
        //Partition Array for Maximum Sum

        int[] A = {1,15,7,9,2,5,10};
        int K = 3;
        //max sum 84
        // A becomes [15,15,15,9,10,10,10]


        int rs = maxSum(A, 0 , K, new Integer[A.length]);
        System.out.println("RESULT "+rs);

    }

    private static int maxSum(int[] a, int s, int k, Integer[] memo) {

        int max = -1;
        int maxSubNum = -1;

        if (s >= a.length) return 0;//base case to exit

        if (memo[s] == null) {
            for (int i = s; i < s+k && i < a.length; i++) {
                maxSubNum = Math.max(maxSubNum, a[i]);
                int local = maxSubNum * (i-s + 1) + maxSum(a, i+1, k, memo);
                System.out.println(local);

                max = Math.max(local, max);

            }
            memo[s] = max;
        }

        return memo[s];
    }

}
