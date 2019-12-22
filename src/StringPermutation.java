import java.util.ArrayList;
import java.util.List;

public class StringPermutation {

    public static void main(String[] args) {

        List<String> data = letterCasePermutation("a1b2");

        data.stream().forEach(System.out::println);

    }


    public static List<String> letterCasePermutation(String S) {

        List<String> result = new ArrayList<>();

        if (S.length() == 0) {
            result.add("");
            return result;
        }

            char c = S.charAt(0);
            if (Character.isLetter(c)) {
                for (String s: letterCasePermutation(S.substring(1))) {

                    result.add( Character.toUpperCase(c) + s);
                    result.add( Character.toLowerCase(c) + s);
                }
            } else {
                for (String s : letterCasePermutation(S.substring(1))) {
                    result.add(c + s);
                }
            }

        return result;

    }

}
