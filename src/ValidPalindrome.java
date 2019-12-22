public class ValidPalindrome {

    public static void main(String[] args) {


        String s = "abca";
        boolean rs = validPalindrome(s);
        System.out.printf(" Result %s " , rs);

    }

    private static boolean validPalindrome(String s) {

        int i = 0;
        int j = s.length() -1;

        while (i < j && s.charAt(i) == s.charAt(j)) {
            i++;
            j--;
        }

       return isValid(s, i +1, j) || isValid(s, i, j-1);
    }

    private static boolean isValid(String s, int i, int j) {

        while (i<j) {
            if (s.charAt(i++) != s.charAt(j--) ) return false;
        }
        return true;

    }
}
