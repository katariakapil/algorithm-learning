public class LC665 {

    public static void main(String[] args) {

        int[] ar  = {3,4,2,3};
       boolean rs =  checkPossibility(ar);
        System.out.println("Result is "+ rs);

    }

    public static boolean checkPossibility(int[] ar) {

        int count = 0;
        int badIndex = -1;

        for (int i=0;i<ar.length-1;i++) {

            if (ar[i] > ar[i+1]) {
                count++;
                badIndex = i;
            }
        }

        if (count > 1) return false;

        return true;

    }
}
