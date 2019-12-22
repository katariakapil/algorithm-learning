public class BinarySearch {


    public static void main(String[] args) {

        int [] data  = {2,3,4,5,6,7,8,9,13,34,67,78};

        //find 34
        // first requirement for binary search is array needs to be sorted. Binary wont work on unsorted array.


        binarySearch(data, 34);

    }

    static void binarySearch(int[] data, int x) {


        search(data, x, 0 , data.length -1 );


    }

    private static void search(int[] data, int x, int l, int r) {

        if (r >= l) {

            int mid = l + (r - l) / 2;
            System.out.println("data" + data[mid]);

            if (data[mid] == x) {
                System.out.println("Found x at " + mid);
                return;
            }

            if (data[mid] > x) {
                search(data, x, l, mid -1);
            } else {
                search(data, x, mid + 1, r);
            }
        }

    }
}
