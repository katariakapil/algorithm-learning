import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ShortestWordFromDict {

    public static void main(String[] args) {

        shortestCompletingWord("1s3 PSt",new String[] {"step", "steps", "stripe", "stepple"});

    }

    public static String shortestCompletingWord(String licensePlate, String[] words) {

        String result = "";

        ArrayList<Character> list = new ArrayList<>();
        for (Character c : licensePlate.toCharArray()) {

            list.add(Character.toLowerCase(c));

        }

        for (String s : words) {

            for (Character c  : s.toCharArray()) {

                if (list.contains(c)) {

                }

            }
        }
        return result;

    }
}
