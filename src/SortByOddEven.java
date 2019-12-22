public class SortByOddEven {
    public static void main(String[] args) {

      int[] result =  sortArrayByParity(new int[] {5,2,4,3,1});

      for (int i: result) {
          System.out.println(i);
      }

    }

    public static int[] sortArrayByParity(int[] A) {
        //
        int even = 0;
        int odd = 0;
        int[] ret = new int[A.length];

        for (int i=0;i<A.length;i++) {

            if (A[i]%2 == 0) {
                ret[even] = A[i];
                even++;
            }
            else {
                ret[A.length - odd -1] = A[i];
                odd++;
            }

        }

        return ret;

    }
}
