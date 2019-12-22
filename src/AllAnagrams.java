import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllAnagrams {


    public static void main(String[] args) {

       List<Integer> rs =  findAnagrams("cbaebabacd","abc");

       rs.forEach(System.out::println);
    }
    public static List<Integer> findAnagrams(String s, String p) {

        ArrayList<Integer> rs = new ArrayList();


        for (int i=0;i<s.length() - (p.length() -1);i++){

            String sub = s.substring(i,i+p.length());
            if (isAnagram(sub,p)) {

                rs.add(i);
            }
        }

        return rs;
    }

    private static boolean isAnagram(String s, String p) {

        char[] c1  = s.toCharArray();
        char[] c2 = p.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);

        for (int i = 0; i < s.length(); i++)
            if (c1[i] != c2[i])
                return false;
            return true;
    }

}
