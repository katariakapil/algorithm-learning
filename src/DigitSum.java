import java.util.HashMap;
import java.util.Map;

public class DigitSum {

    public static void main(String[] args) {


        int[] a = {51,71,17,42};

        Map<Integer,Integer> map = new HashMap<>();
        int max = Integer.MIN_VALUE;

        for (int i=0;i<a.length;i++) {

            int digitSum = getDigitSum(a[i]);
            if (map.get(digitSum) !=null) {

                max = Math.max(max, map.get(digitSum) + a[i] );
            } else {

                map.put(digitSum, a[i]);
            }

        }

        System.out.println(max);



    }

    private static int getDigitSum1(int i) {
        int rs = 0;

        while (i > 0) {
            rs += i%10;
            i /=10;
        }
        return rs;
    }

    private static int getDigitSum(int i) {

        char[] a = String.valueOf(i).toCharArray();
        int rs = 0;
        for (char c:a){
            rs += Character.getNumericValue(c);
        }
        return rs;
    }
}
