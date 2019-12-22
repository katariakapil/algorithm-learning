public class LongestSubString {

    static String X;
    static String Y;
    public static void main(String[] args) {

        // find the longest substring between 2 Strings
        X = "abcdxyz";
        Y = "xyzabcd";

        int count = badCodeNotWorking();
        System.out.println("incorrect"+ count );

        // lets do dynamic programming to find longest substring

        // we need to

        count = 0;

        //lets start with 0 index and 0 count
        count = lca(X.length() , Y.length(), count);

        System.out.println(count);

    }

    private static int lca(int i, int j,  int count) {

        // base either of index reached to end
        if (i == 0 || j == 0) return count;
        // 7 -1
        // z == d
        if (X.charAt(i -1) == Y.charAt(j -1 )) {
            count = lca(i -1, j -1 , count + 1);
        }

        count = Math.max(count,
                        Math.max(lca(i -1, j , 0) , lca(i, j -1, 0)));

        return count;
    }

    private static int badCodeNotWorking() {
        int i = 0;
        int j = 0;
        int count=0;
        while (X.length() > i && Y.length() > j) {

            if (X.charAt(i) == Y.charAt(j)) {
                i++;
                j++;
                count++;
            } else {
                i++;
            }
        }
        return count;
    }
}
