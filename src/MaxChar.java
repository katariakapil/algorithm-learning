import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MaxChar {

    public static void main(String[] args) {
      String res =  mostCommonWord("Bob hit a ball, the hit BALL flew far after it was hit.", new String[] {"hit"});

        System.out.println(res);
    }
        public static String mostCommonWord(String paragraph, String[] banned) {

            Map<String,Integer> map = new HashMap();

            paragraph = paragraph.replace("!","");
            paragraph = paragraph.replace("?","");
            paragraph = paragraph.replace("''","");
            paragraph = paragraph.replace(",","");
            paragraph = paragraph.replace(";","");
            paragraph = paragraph.replace(".","");

            for (String s : paragraph.toLowerCase().split(" ")) {

                if (map.containsKey(s)) {
                    map.put(s,map.get(s) + 1);
                }else {
                    map.put(s, 1);
                }
            }


            for (int i=0;i<banned.length;i++) {
                if (map.containsKey(banned[i]))
                    map.remove(banned[i]);
            }
            int maxCount = 0;

            String key = Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();

            return key;

        }

}
