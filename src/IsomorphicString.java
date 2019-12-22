import java.util.HashMap;
import java.util.Map;

public class IsomorphicString {


    public static void main(String[] args) {

        isIsomorphic("foo","bar");

        isIsomorphic("egg","add");
    }


    public static boolean isIsomorphic(String s, String t) {

        String s1 = buildPattern(s);
        String s2 = buildPattern(t);

        return buildPattern(s).equals(buildPattern(t));
    }

    private static String buildPattern(String s) {

        StringBuilder sb1  = new StringBuilder();

        Map<Character,Integer> map = new HashMap();

        for (int i=0;i<s.length();i++) {

            if (map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), map.get(s.charAt(i)));
                sb1.append(map.get(s.charAt(i)));

            } else {
                map.put(s.charAt(i), i);
                sb1.append(i);
            }

        }

        return sb1.toString();

    }
}
