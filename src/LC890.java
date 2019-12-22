import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.RandomAccess;

public class LC890 {

    public static void main(String[] args) {

        String pattern = "mee";
        String[] ar = {"abc","deq","mee","aqq","dkd","ccc"};


        int[] hash = new int[26];

        int num = 1;
        String generatedPattern = "";

        for (char c : pattern.toCharArray()) {

            if (hash[c - 'a'] == 0) {
                hash[c - 'a'] = num;
                num++;//create new number now since num is given to a char
            }
            generatedPattern += hash[c - 'a'];

        }
        System.out.println(generatedPattern);

        System.out.println(hash);


    }

    public static boolean match(String s , String p) {

        Map<Character,Character> map = new HashMap<>();
        Map<Character,Character> reversemap = new HashMap<>();

        if (s.length() < p.length()) return false;

        for (int i=0;i<s.length();i++) {

            if (!map.containsKey(s.charAt(i)))
            map.put(s.charAt(i), p.charAt(i));

            if (!reversemap.containsKey(p.charAt(i)))
                reversemap.put(p.charAt(i), s.charAt(i));

            if (map.get(s.charAt(i)) != p.charAt(i)
                    || reversemap.get(p.charAt(i)) != s.charAt(i))
                return false;

        }
        return true;

    }

}
