package chapter10__SORTING__SEARCHING;

public class SelectionSort extends Sorting {

    public static void main(String[] args) {

        //selection sort find lowest and then swap just loop all elements O(N^2).  Basic of all sorting algorithms.
        for (int i=0;i<a.length;i++) {
            for (int j = i;j<a.length;j++) if (a[i] > a[j]) swap(a, i, j);
        }
        print(a);

    }
}
