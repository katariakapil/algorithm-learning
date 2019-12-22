public class Anagram {

    public static void main(String[] args) {

        String s = "hello";

        String t = "ollhe";

        // convert in lowercase if case is not sensitive

       boolean b = isAnagram(s, t);
        System.out.println(b);

    }

    private static boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) return false;//strings dont have exact length so not anagram

        int[] c = new int[26];
        for (char ch : s.toCharArray()) {
            c[ch - 'a']++;
        }

        for (char ch : t.toCharArray()) {

            c[ch - 'a']--;

        }

        for (int i:c) {
            if (i !=0) return false;
        }

        return true;
    }
}
