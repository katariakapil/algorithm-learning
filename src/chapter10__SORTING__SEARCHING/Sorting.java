package chapter10__SORTING__SEARCHING;

public class Sorting {

    static int[] a  = {2,3,5,62,15,56,782,66,89};

    protected static void print(int[] a) {

        for (int i: a ) System.out.print(i + " ");
    }

    protected static void swap(int[] ar, int i , int j) {

        int temp = ar[i];
        ar[i] = ar[j];
        ar[j] = temp;
    }
}
