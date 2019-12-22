import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PlusOne {

    public static void main(String[] args) {

    //  int[] rs = plusOne(new int[]{1,9});

       List<Integer> rs1 = addToArrayForm(new int[]{9,9}, 1);

      for(int i:rs1) {
          System.out.println(i);
      }
    }

    public static List<Integer> addToArrayForm(int[] A, int K) {
        int N = A.length;
        int curr = K;
        List<Integer> ans = new ArrayList();
        int i=N;
        while (curr>0) {

            if (i>=0) { //only do for items in array add both numbers

                curr += A[i];
            }
            ans.add(curr%10);//add last digit here
            curr = curr / 10;
            --i;
        }


        Collections.reverse(ans);
        return ans;
    }


    //9,9
    //9,9
    //0,0
    static int[] plusOne(int[] a) {

        int n = a.length;

        for (int i=n-1; i>=0; i--) {

            if (a[i] < 9){
                 a[i]++;
                 return a;
            }
            a[i] = 0;

        }

        int[] rs = new int[n+1];
        rs[0] = 1;

        return rs;
    }
}
