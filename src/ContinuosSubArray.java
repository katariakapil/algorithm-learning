public class ContinuosSubArray {

    public static void main(String[] args) {


        /*int[] ar = {-2,1,-3,4,-1,2,1,-5,4};

        int max = Integer.MIN_VALUE;
        int local = 0;
        for (int i=0;i<ar.length;i++) {

            local = Math.max(ar[i] , ar[i] + local);
            if (local > max) {
                max = local;
            }

        }
        System.out.println("MAX"+max);
*/
        int [] arr = {1, 2};
        int k = 3;

        int[] d = new int[arr.length*k];

        for (int i=0;i<arr.length*k;i++) {

            d[i] = arr[i%arr.length];
        }

        for (int i:d){
            System.out.println(" > "+ i);
        }


    }

}
