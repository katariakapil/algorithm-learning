import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SherlokAnagramHAckerRank {

  static int getAp (int n) {
      return (n * (n + 1)) / 2;

  }
        static String stringSort (String s) {
            char chars[] = s.toCharArray();
            Arrays.sort(chars);
            return new String(chars);
        }

        static HashMap<String, Integer> getSubStrings (String s) {
            HashMap<String, Integer> map = new HashMap<>();

            for (int i=0; i<s.length(); i++) {
                String sub = "" + s.charAt(i);
                if (map.containsKey(sub)) {
                    map.put(sub, map.get(sub) + 1);
                } else {
                    map.put(sub, 1);
                }

                for (int j=i+1; j<s.length(); j++) {
                    sub = stringSort(sub + s.charAt(j));
                    if (map.containsKey(sub)) {
                        map.put(sub, map.get(sub) + 1);
                    } else {
                        map.put(sub, 1);
                    }
                }
            }
            return map;
        }

        static int sherlockAndAnagrams(String s) {
            HashMap<String, Integer> map = getSubStrings(s);

            int count = 0;

            for (Map.Entry entry : map.entrySet()) {
                int value = (int) entry.getValue();
                if (value > 1) {
                    count += getAp(value - 1);
                }
            }
            return count;
        }

        public static void main(String[] args) {
            String str = "cdcd";

            System.out.println(sherlockAndAnagrams(str));
        }

    }
