public class FibRecursive {

    public static void main(String[] args) {

        int n = 7;


        int cur = 0, prev = 1, prevprev = 0;

        for (int i=1;i<n;i++) {

            cur = prev + prevprev;
            prevprev = prev;
            prev = cur;

        }


        System.out.println("Current : "+ cur);
    }
}
