public class MinPosition {

    public static void main(String[] args) {


        result("loveleetcode", 'e');

    }

    public static int[] result(String s, char c ) {
        int[] ans = new int[s.length()];
        int pos = -1000;

        for (int i=0;i<s.length();i++) {

            if (s.charAt(i) == c ) pos = i;
            ans[i] = i - pos;

        }

        for (int i=s.length()-1;i>=0;i--) {

            if (s.charAt(i) == c ) pos = i;
            ans[i] = Math.min(ans[i], pos -i);
        }

        return ans;
    }

}

