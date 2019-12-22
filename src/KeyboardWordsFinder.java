import java.util.*;

public class KeyboardWordsFinder {

    public static void main(String[] args) {

        findWords(new String[] {"Hello", "Alaska", "Dad", "Peace"});

    }

    public static String[] findWords(String[] words) {

        String[] keyboard = {"QWERTYUIOP","ASDFGHJKL","ZXCVBNM"};

        HashMap<Character,Integer> map = new HashMap();
        //copy all element in map
        // with key as char , index
        for (int i=0;i<keyboard.length;i++) {
            for (Character c : keyboard[i].toCharArray()) {
                map.put(c,i);
            }
        }

        List<String> result = new ArrayList<>();

        for (String word : words) {
            char[] chars = word.toCharArray();

           int index =  map.get(Character.toUpperCase(chars[0]));
            for (int i=0;i<chars.length;i++){

                if (index != map.get(Character.toUpperCase(chars[i]))) {
                     index = -1;
                    break;
                }
            }
            if (index != -1) result.add(word);

        }

        return result.toArray(new String[result.size()]);
    }

}
