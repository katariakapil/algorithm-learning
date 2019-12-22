public class Palindrome {


    public static void main(String[] args) {


        String s = "abccccdd";// find longestPalindrome
        int[] c = new int[128];
        for (char ch : s.toCharArray()) {

            c[ch]++;

        }

        int ans = 0;

        for (int i: c) {
            ans += i / 2*2;// partnered, which is 5 // 2 * 2 = 4
            if (ans % 2 == 0 && i % 2 == 1) ans++; // v % 2 == 1 and ans % 2 == 0,unique char
        }

        System.out.println(ans);

    }


}
