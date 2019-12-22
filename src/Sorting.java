public class Sorting {

    public static void main(String[] args) {

        int[] ar = {1, 3, 4, 5, 6, 7, 5, 2, 9};
        int p = 5;


        for(int i : ar) System.out.print(i + " , ");
    }

    private static void sortArray(int[] ar, int p) {

        int i = 0;
        int j = ar.length - 1;


        while (i < j) {

            int left = ar[i];

            if (left < p) {
                //move towards right, element at correct position
                i++;
            } else {

                int right = ar[j];

                if (right < p) {
                    ar[j] = left;
                    ar[i] = right;
                    i++;j--;
                }
                else j--;

            }
        }
    }

}
