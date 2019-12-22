public class SortingLearning {

    public static void main(String[] args) {

        int[] data = {40,30,20,10};

     //  selectionSort(data);
      // bubleSort(data);
      // insertionSort(data); // keep
        mergesort(data);

    }

    public static void mergesort(int[] data){

        //split array until one element left
        // merge subarrays comparing the left and right and put in final array.


        int n = data.length;
        int left = 0;
        int right = n -1;
        split(data, left, right);
        print(data);


    }

    private static void split(int[] data, int left , int right) {
        if (left < right ) {

            int mid = (left + right )/2;
            split(data, left , mid);
            split(data, mid+1 , right);

            //merge now
            merge(data, left, mid, right);
        }

    }

    private static void merge(int[] data, int left, int mid, int right) {

        int arr1 = mid - left + 1;
        int arr2 = right - mid;

        int L[] = new int[arr1];
        int R[] = new int[arr1];

        for (int i=0;i<arr1;i++) {
            L[i] = data[left+ i];
        }
        for (int i=0;i<arr2;i++){
            R[i] = data[mid + 1 + i];
        }

        int i =0, j =0; // left array and right array index where to pick element
        int k = left;// main index for new array
        // keep looping until we check all elements from both sides
        while (i < arr1 && j < arr2) {

            if (L[i] <= R[j]) {
                data[k] = L[i];
                i++;
            } else {
                data[k] = R[j];
                j++;
            }
            k++;
        }
        //copy left over elements on left array
        while ( i < arr1) {
            data[k] = L[i];
            i++;
            k++;
        }
        //copy left over elements on right array
        while (j < arr2) {
            data[k] = R[k];
            j++;
        }

    }


    public static void insertionSort(int[] data) {

        for (int i=1;i<data.length;i++) {
            int value = data[i];
            int hole = i;
            while (hole > 0 && data[hole -1 ] > value ) {
                data[hole] = data[hole -1];
                hole--;
            }
            data[hole] = value;
        }
        print(data);
    }

    public static void bubleSort(int[] data) {
        for (int i=0;i<data.length;i++) {
            for (int j=0;j<data.length -1;j++) {
                //compare neighbour element with current element and swap
                if (data[j] > data[j+1]) {
                    swap(data,j, j+1);
                }
            }
        }
        print(data);
    }

    public static void selectionSort(int[] data) {
        for (int i=0;i<data.length;i++) {
            for (int j=i+1;j<data.length;j++) {
                //compare the i with j element and swap.
                if (data[i] > data[j]) {
                    swap(data, i, j);
                }
            }
        }
        print(data);
    }

    private static void print(int[] data) {
        for (int r: data) {
            System.out.print(r + " ,");
        }
    }

    static void swap(int[] data , int l, int r) {

        int temp = data[l];
        data[l] = data[r];
        data[r] = temp;

    }
}
