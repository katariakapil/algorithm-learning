public class InsertionSort {

    public static void main(String[] args) {
        int[] val  = {299,52,34,25,51,6,25,26};

        int hole =4;
        while (hole > 0 && val[hole] > 36 ) {
            val[hole] = val[hole -1];
            hole--;
        }


        for (int i: val) {
            System.out.println(i);
        }
    }
}
