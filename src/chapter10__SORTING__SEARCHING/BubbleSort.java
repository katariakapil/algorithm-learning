package chapter10__SORTING__SEARCHING;

public class BubbleSort extends Sorting {

    public static void main(String[] args) {

        boolean swap = false;
        // compare neighbours and then swap
        // keep a flag to maintain if no swap happened in whole iteration mean we dont need to run further.
        // Bubble sort runtime is O(n^2)

        for (int i=0;i<a.length;i++) {
            for (int j = i;j<a.length - 1;j++) {

                if (a[j] > a[j + 1]) {
                    swap(a, j, j+1);
                    swap = true;
                }
            }

            if (!swap)break;
        }
        print(a);
    }

}
