import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class ShuffleString {

    public static void main(String[] args) {

        String s = "hello";
        Random r  = new Random();


        char[] c = s.toCharArray();
        Set<String> set = new HashSet<>();

        for  (int j=0;j<=200;j++ ) {
            for (int i = 0; i < c.length; i++) {

                int index = r.nextInt(s.length());

                char temp = c[i];
                c[i] = c[index];
                c[index] = temp;

            }

            String sb = new String(c);
            set.add(sb);

        }
        System.out.println(set.size());
        int[] count = new int[26];
        for (String st: set) {

           for (char cha : st.toCharArray()) {
               count[cha - 'a']++;
           }

        }
        for (int i : count) {
            System.out.println( i );
        }
    }



}
