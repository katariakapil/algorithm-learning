package chapter8__DYNAMIC_PROGRAMMING;


public class FibNumber {

    public static void main(String[] args) {

        long start = System.currentTimeMillis();

        int number = 20;
        int[] memo = new int[number + 1];
        memo[0] = 0;
        memo[1] = 1;
       int i= fib(number, memo);
       //1 ms took //10946
        System.out.println(i);
        i= fibRecursive(number);
        System.out.println(i);

        System.out.println(System.currentTimeMillis() - start + " ms took" );
    }

    /**
     * Top down  approch - or called memoization
     */
    private static int fib(int i, int[] memo) {

        if (i == 0) return 0;
        if (i == 1) return 1;

        System.out.println("CALLING....");

        if (memo[i] != 0) return memo[i];

        memo[i] =  fib(i - 1, memo) + fib (i -2, memo );
        return memo[i];
    }

    private static int fibRecursive(int i) {


         int a = 0;
        int b = 1;
        for (int j = 2;j<i;j++){

            int ans = a + b;
            a = b;
            b = ans;
        }
        return a + b;
    }
}
