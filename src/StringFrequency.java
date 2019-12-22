import java.util.*;

public class StringFrequency {

    public static void main(String[] args) {

        /**
         * Write function to find out the Kth recurring string from list of strings.
         *
         * {a=3, problem=2, byte=3, by=1, this=1, This=1, is=1, great=1, repeated=1, kth=1}
         * {1=[by, this, This, is, great, repeated, kth], 2=[problem], 3=[a, byte]}
         *
         *
         */
        String[] strings = {"This", "is" , "a" , "byte" , "by", "byte" , "problem", "this", "a", "great", "problem",
                "a", "kth" , "repeated", "byte"};


        HashMap<String,Integer> map = new HashMap<>();//this map will hold the frequency of strings.. [ String, Integer]
        TreeMap<Integer, ArrayList<String>> listHashMap = new TreeMap();// this map will have the [ frq, List<String> ]
        for (String s : strings) {

            map.put(s, map.getOrDefault(s, 0) + 1);

        }

        System.out.println(map.toString());

        for (Map.Entry<String,Integer> entry : map.entrySet()) {

            String key = entry.getKey();// STRING
            Integer value = entry.getValue();// COUNT

            ArrayList<String> listStrings = listHashMap.get(value);
            if (listStrings == null) {
                listStrings = new ArrayList<>();
                listStrings.add(key);
            }else {
                listStrings.add(key);
            }
            listHashMap.put(value, listStrings);

        }

        System.out.println(listHashMap.toString());

    }
}
