import java.util.Arrays;

public class CoinChange {

    public static void main(String[] args) {


        int cents = 30;

        int moneyLeft = cents;
        int[] coins = {1, 2, 5};

        System.out.println(coinChange(coins, 11));

        }

    public static int coinChange(int[] coins, int amount) {
        int max = amount + 1;
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, max);
        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            for (int j = 0; j < coins.length; j++) {
                if (coins[j] <= i) {
                    dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
                }
            }
        }
        return dp[amount] > amount ? -1 : dp[amount];
    }
}
