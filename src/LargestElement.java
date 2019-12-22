public class LargestElement {

    public static void main(String[] args) {


        int[] d = new int[] {1,8,4,6,7,10,9,5};

        int max = d[0];

        for (int i: d) {

            max = Math.max(max,i);
        }

        System.out.println(max);
    }
}
