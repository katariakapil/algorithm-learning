public class RotateArray {

    public static void main(String[] args) {

        int[] ar = {1,2,3,4,5,6,7};
        int k = 3;

      //  arrayrotateBrute(ar, k);

        int[] nar = new int[ar.length];

        for (int i=0;i<ar.length;i++) {
            nar[(i + k) % ar.length] = ar[i];
        }

        System.out.println(nar);
        for (int i:nar){
            System.out.println(i);
        }

    }

    private static void arrayrotateBrute(int[] ar, int k) {
        int temp, prev;
        for (int i=0;i<k;i++) {

            prev = ar[ar.length -1];
            for (int j=0;j<ar.length;j++) {
                temp = ar[j];
                ar[j] = prev;
                prev = temp;
            }

        }
    }
}

