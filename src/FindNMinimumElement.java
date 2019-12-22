import java.util.Arrays;

public class FindNMinimumElement {

    public static void main(String[] args) {

        int [] ar = {23,34,3,5,42,35,31};
        int n = 4;
        findNSmallestElement(ar, n);
    }

    private static void findNSmallestElement(int[] ar, int n) {

        int start  = 0;
        int end = ar.length - 1;
        int[] newAr = new int[ar.length];
        int index = 0;

        while (start < end) {

            //move small to left side of array and larger to right side;

            if (ar[index] < ar[index + 1]) {
                newAr[start] = ar[index];
                start++;
            } else {
                newAr[end] = ar[index];
                end--;
            }
            index ++;

        }


        //check if our nth index reached
        if (n > start) {
            //look on left
            findNSmallestElement(Arrays.copyOfRange( newAr, start + 1, newAr.length), n -start );
        } else if (n < start) {

            findNSmallestElement(Arrays.copyOfRange( newAr, 0, start),start);
        } else {
            System.out.println(ar[start]); //found it at index
        }


    }
}
