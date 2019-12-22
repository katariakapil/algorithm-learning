import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CharCountProgram {

    public static void main(String[] args) {

       List<String> res =  commonChars(new String[] {"bella","label","roller"});

       for (String s : res) {
           System.out.println(s);
       }

    }

    public static List<String> commonChars(String[] A) {
        List<String> ans = new ArrayList<>();
        int[] count = new int[26];
        Arrays.fill(count, Integer.MAX_VALUE);
        for (String str : A) {
            int[] cnt = new int[26];
            for (char c : str.toCharArray()) {
                ++cnt[c - 'a'];
            } // count each char's frequency in string str.
            for (int i = 0; i < 26; ++i) {
                count[i] = Math.min(cnt[i], count[i]);
            } // update minimum frequency.
        }
        for (char c = 'a'; c <= 'z'; ++c) {
            while (count[c - 'a']-- > 0) { ans.add("" + c); }
        }
        return ans;
    }
}
