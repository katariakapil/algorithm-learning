import java.util.TreeSet;

public class UglyNumber {

    public static void main(String[] args) {


       boolean rs =  isUgly(14);

        System.out.println(rs);

       int rs1 =  nthUglyNumber(10);
        System.out.println("Nth Ugly "+ rs1 );
    }

    private static boolean isUgly(int num) {

        int[] nums = new int[]{2,3,5};

        for (int i=0;i<nums.length;i++) {
            while (num % nums[i] == 0) {
                num = num / nums[i];
            }
        }
        return num == 1;
    }

        public static int nthUglyNumber(int n) {
            TreeSet<Long> ans = new TreeSet<>();
            ans.add(1L);
            for (int i = 0; i < n - 1; ++i) {
                long first = ans.pollFirst();//The pollFirst() method is used to retrieve and
                // remove the first (lowest) element, or returns null if this set is empty.
                ans.add(first * 2);
                ans.add(first * 3);
                ans.add(first * 5);
            }
            return ans.first().intValue();
        }

}
