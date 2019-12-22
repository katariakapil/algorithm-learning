import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class UberSubString {

    public static void main(String[] args) {

        String[] words = {"Apple", "Melon", "Orange", "Watermelon"};
        String[] parts = {"a", "mel", "lon", "el", "An"};
        ArrayList<String>  res = new ArrayList<>();

        for (String word: words) {

            int index = -1, size = 0;
            for (String p : parts) {

                if (word.indexOf(p) >= 0 && p.length() > size) {
                    index = word.indexOf(p);
                    size = p.length();
                }

            }

            if (index >= 0) { //it can start from zero so take =

                StringBuilder sb = new StringBuilder(word);

                sb.insert(index, '[');
                sb.insert(index + size + 1, ']');
                res.add(sb.toString());
            } else {
                res.add(word);

            }
        }

        for (String s : res) {
            System.out.println("Final " + s );

        }    }
}
