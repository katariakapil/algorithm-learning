public class MinSwap {

    public static void main(String[] args) {


        int [] arr  = {7, 1, 3, 2, 4, 5, 6};

        int swap = 0;
        for (int i = 0; i < arr.length; i++) {
            while (i+1 != arr[i]) {
                int temp = arr[arr[i] - 1];
                arr[arr[i] - 1] = arr[i];
                arr[i] = temp;
                swap++;
            }
        }

        System.out.println(swap);
    }
}
