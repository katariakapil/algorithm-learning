public class SortNumbers {
    public static void main(String[] args) {

        System.out.println(Math.abs(-90));

        int[] res = sortedSquares(new int[]{-4,-1,0,3,10});
        for (int r : res) {
            System.out.println(r);
        }
    }
    public static int[] sortedSquares(int[] A) {

        int [] arr = new int[A.length];

        int i = 0, p = A.length -1;


        for (int j = A.length - 1;j>= 0;j--) {

            if (Math.abs(A[i]) > Math.abs(A[p])) {
                arr[j] = A[i] * A[i];
                i++;
            } else {

                arr[j] = A[p] * A[p];
                p--;
            }
        }


        return arr;
    }

}
