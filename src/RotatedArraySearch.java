public class RotatedArraySearch {

    public static void main(String[] args) {

        int [] ar = {4,5,6,7,8,1,2,3};

        //find 6 in array.  Array is circularly rotated.

        int low = 0;
        int high = ar.length -1;
        int target = 6;

       int i = search(ar, low, high, target);

      int pivot =  searchPivot(ar, low, high);

        System.out.println(" PIVOT .... "+ pivot);

        System.out.println(i);

    }

    private static int searchPivot(int[] ar, int low, int high) {

        if (high < low) return -1;//not found array is not rotated
        if (low == high) return low;

        int mid = low + (high - low)/2;
        if (mid < high // to check base case
                && ar[mid] > ar[mid+1]) {
            // this is the point where element i > i +1 // since array is asc order increment only one index will have
            // such condition. 8 > 1
            return mid;
        }
        if (mid > low //to check base case
                && ar[mid] < ar[mid -1]) {
            // at this point element i < i -1 // 8 < 1
            return mid-1;
        }

        if (ar[low] >= ar[mid]) {
           return searchPivot(ar, low , mid -1 );
        }

        return searchPivot(ar , mid +1 , high);

    }

    private static int search(int[] ar, int low, int high, int target) {

            if (low > high) return -1;

            int mid = low + (high - low)/2;

            if (ar[mid] == target) {
                System.out.println("Found at index" + mid);
                return mid;
            }

            //first half is sorted
            if (ar[low] <= ar[mid]) { //4 > 7

                if (target >= ar[low] && target <= ar[mid])
                {
                    search(ar , low , mid -1 , target);// now search on left half
                } else {
                    search(ar, mid+1, high, target);//search in other half right side
                }


            }

            if (target >= ar[mid] && target <= ar[high]) {
                //target should be on right side
                return search(ar, mid+1 , high, target);
            }
        return search(ar , low , mid -1 , target);
    }
}
