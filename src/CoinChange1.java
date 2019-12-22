public class CoinChange1 {


    public static void main(String[] args) {

        // some artificial coins
        int[] coins = {1,2,5,7,10,25};

        int target = 37;


        int[] memo = new int[target+1];

        int mincount =  coinchange(target, coins, memo);

        System.out.println(mincount);

    }

    private static int coinchange(int target, int[] coins, int[] memo) {

        if (target == 0) return 0;//base case when we no more change is needed.
        int mincount = target;// or Integer.MAX_VALUE
// now lets get min value of coins min (x, 25) (x, 10) (x, 7) (x, 5) (x, 2) (x, 1)

        for (int coin : coins ) {

            int left = target - coin;
            if ( left >= 0) {
                //return from memo table
                if (memo[left] < 0)
                    return memo[left];

                int change = coinchange(left, coins, memo);
                memo[left] = change;

                if (mincount > change)
                    mincount = change +1;
            }

        }

        return  mincount;

    }
}
