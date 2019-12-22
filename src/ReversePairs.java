public class ReversePairs {

    public static void main(String[] args) {

        int[] d = {1,3,2,3,1};
        int count = 0;
        for (int i=0;i<d.length;i++) {

            for (int j =0;j<d.length;j++) {

                if (d[j] > d[i] * 2) {
                    count++;
                }
            }
        }
    }
}
