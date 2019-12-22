package bytebybyte;

import java.util.Arrays;

public class MergeTwoSortedArray {

    public static void main(String[] args) {


        int[] a = {1,3,5,0,0,0};
        int[] b = {2,4,6};


        bruteforce(a, b);

        //@todo write optimal solution
    }

    private static void bruteforce(int[] a, int[] b) {
        int j =0;
        for (int i = b.length -1 ;i>=0;i--) {

            System.out.println(i);
            a[a.length - 1 - i] = b[j];
            j++;
        }
        Arrays.sort(a);
        for (int i :a) {
            System.out.print(i+" ");
        }
    }
}
