public class StockPrice {

    public static void main(String[] args) {

        try {
            stockPrice(new int[]{3,5,2,6,9,3,11});
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }

    public static void stockPrice(int[] prices) throws Exception{

        if (prices.length < 2) {
            throw new Exception("cannot get profit at least need two purchases");
        }

        int minPrice = prices[0];

        int maxProfit = prices[1] - prices[0];

        for (int i=1;i<prices.length;i++) {

            minPrice = Math.min(minPrice,prices[i]);

            int profit = prices[i] - minPrice;

            maxProfit = Math.max(maxProfit,profit);

        }

        System.out.println(maxProfit);


    }
//when we can do multiple transactions buy n sell.
    public int maxProfit(int[] prices) {

        int max = 0;
        for (int i=1;i<prices.length;i++) {

            if (prices[i] > prices[i-1]) {
                max += prices[i] - prices[i-1] ;
            }

        }

        return max;

    }
}
