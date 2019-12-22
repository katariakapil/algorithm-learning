public class MissingElementInSortedArray {

    public static void main(String[] args) {

        int[] ar = {1,2,3,4,5,6,7,9};

       /*

        An efficient solution is based on the divide and conquer algorithm that we have seen in binary search,
        the concept behind this solution is that the elements appearing before the missing element will
        have ar[i] – i = 1 and those appearing after the missing element will have ar[i] – i = 2.

         */

        int low = 0;
        int high = ar.length -1;
        int mid = 0;

        while (high - low  > 1) { //means we found the missing elements when

             mid = low + (high - low)/2;

            if (ar[low] - low != ar[mid] - mid) {
                high = mid;
            } else {
                low = mid;
            }


        }

        System.out.println(ar[mid] + 1);

    }
}
