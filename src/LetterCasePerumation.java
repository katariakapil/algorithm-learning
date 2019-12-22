import java.util.*;

public class LetterCasePerumation {

    static List<String> rs  = new ArrayList<>();
    public static void main(String[] args) {

        HashMap h = new HashMap();

        letterCasePermutation("a1b2");
    }

    public static List<String> letterCasePermutation(String S) {

        permute(S,0);

        return rs;
    }

    private static void permute(String s, int i) {

        if (i >= s.length()){
            rs.add(s);
            return;
        }

        if (Character.isLetter(s.charAt(i))){

            String s1 = s.substring(0,i)+ Character.toLowerCase(s.charAt(i)) +  s.substring(i+1,s.length());
            String s2 = s.substring(0,i)+ Character.toUpperCase(s.charAt(i))+    s.substring(i+1,s.length());

            permute(s1,i+1);
            permute(s2,i+1);
        } else {

            permute(s,i+1);
        }
    }
}
