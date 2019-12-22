public class MostWaterContainer {

    public static void main(String[] args) {


        maxWater(new int[]{1,8,6,2,5,4,8,3,7});

    }

    private static void maxWater(int[] w) {

        int max = 0;
        int l = 0;
        int h = w.length;

        while (l < h){

            max = Math.max(max,  Math.min( w[l], w[h]) * (h - l)  );

            if (w[l] > w[h]) {
                h--;
            } else {
                l++;
            }
        }

    }
}
