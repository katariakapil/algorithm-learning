public class StairCase {

    public static void main(String[] args) {

        System.out.println(arrangeCoins(5));
    }

    public static int arrangeCoins(int n) {

        int res = 0;
        int level = 1;
        while(n >= level){
            res++;
            n -= level;
            level++;
        }
        return res;

    }
}
