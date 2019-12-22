import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PhoneNumberCombination {

   static HashMap<String, String> hashMap = new HashMap<String,String>();

    public static void main(String[] args) {


        hashMap.put("2", "abc");
        hashMap.put("3", "def");
        hashMap.put("4", "ghi");
        hashMap.put("5", "jkl");
        hashMap.put("6", "mno");
        hashMap.put("7", "pqrs");
        hashMap.put("8", "tuv");
        hashMap.put("9", "wvyz");

        PhoneNumberCombination ph = new PhoneNumberCombination();
        List<String> rs = ph.letterCombinations("23");

        for (String s: rs) {
            System.out.println(s);
        }

    }

      List<String> result = new ArrayList();

    public List<String> letterCombinations(String digits) {
        backtrack("",digits);
        return result;
    }

    public void backtrack(String combo, String digits) {

        if (digits.length() == 0) {
            result.add(combo);
        } else {

            String s = digits.substring(0,1);
            String letters = hashMap.get(s);

            for (int i=0;i<letters.length();i++) {
                String letter  = letters.substring(i,i+1);
                backtrack(combo+letter, digits.substring(1));
            }

        }
    }
}
