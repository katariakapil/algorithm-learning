public class StringCounter {


    public static void main(String[] args) {

        for (int s:  diStringMatch("IDID"))
        System.out.println(s);
    }
    public static int[] diStringMatch(String S) {

        int inc = 0;
        int dec = S.length();
        int[] res = new int[S.length()+1];//start with length plus 1
        for (int i=0;i<S.length();i++) {

            if (S.charAt(i) == 'I') {
                res[i] = inc;
                inc++;
            }
            else {
                res[i] = dec;
                dec--;
            }


        }

        return res;

    }
}
