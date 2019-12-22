public class SortArrayByParity {

    public static void main(String[] args) {


        int[] ar = new int[] {3,1,2,4};
        sortArrayByParity(ar);

        for (int l : ar){
            System.out.print(l + " ");
        }
    }

    /*
    We'll maintain two pointers i and j. The loop invariant is everything below i has parity 0 (ie. A[k] % 2 == 0 when
     k < i), and everything above j has parity 1.

    Then, there are 4 cases for (A[i] % 2, A[j] % 2):

    If it is (0, 1), then everything is correct: i++ and j--.

    If it is (1, 0), we swap them so they are correct, then continue.

    If it is (0, 0), only the i place is correct, so we i++ and continue.

    If it is (1, 1), only the j place is correct, so we j-- and continue.

    Throughout all 4 cases, the loop invariant is maintained, and j-i is getting smaller. So eventually we will be done
    with the array sorted as desired.
     */
    public static int[] sortArrayByParity(int[] A) {
        int i = 0, j = A.length - 1;

        while (i < j) {

            if (A[i] % 2 > A[j] % 2){
                swap(A,i,j);
            }

            if (A[i] %2 == 0) i++;
            if (A[j] %2 == 1) j--;

        }

        return A;
    }

    public static void swap(int[] ar, int i, int j){

        int temp = ar[i];
        ar[i] = ar[j];
        ar[j] = temp;
    }
}
