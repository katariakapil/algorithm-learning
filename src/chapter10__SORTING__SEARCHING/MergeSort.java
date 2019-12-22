package chapter10__SORTING__SEARCHING;

public class MergeSort extends Sorting{

    public static void main(String[] args) {

        int low = 0;
        int high = a.length -1;
        int[] helper = new int[a.length];//create a helper to keep left & right subarrays.

        //Algo for merge sort

        // split array in sub arrays till one element left..
        // merge array
        mergeSort(a, helper, low, high);
        print(a);

    }


// MERGE does the heavy lifting...
    private static void merge(int[] a, int[] helper , int low, int mid , int high) {

        //copy both half in helper

        for (int i=low;i<=high;i++) {
            helper[i] = a[i];
        }

        int left = low;
        int curr = low;
        int right = high;

        while (left <= mid && right <= high) {
            //time to compare and put in helper

            if (helper[left] < helper[right]) {
                a[curr]  = helper[left];
                left++;
            } else {
                a[curr] = helper[right];
                right++;
            }
            curr++;
        }

        //copy remaining left into
        int rem = mid - left;

        for (int i = 0;i<= rem;i++) {
            a[curr + i] = helper[left + i];
        }

    }

    private static void mergeSort(int[] ar, int[] helper,  int low, int high) {

        if (low < high) {

            int mid = low + (high - low) / 2;
            //sort first and second half first
            mergeSort(ar,helper,  low , mid);
            mergeSort(ar, helper , mid+1 , high);
            //merge sorted sub-arrays
            merge(a, helper, low , mid , high);
        }

    }
}
