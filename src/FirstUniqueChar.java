import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;

public class FirstUniqueChar {

    public static void main(String[] args) {
        FirstUniqueChar f = new FirstUniqueChar();

        int rs = f.firstUniqChar1("aadadaad");
        System.out.println(rs);

    }

    private int firstUniqChar1(String s) {

        int[] ar = new int[26];

        for (int i=0;i<s.length();i++) {

            ar[s.charAt(i) - 97]++;
        }

        for (int i=0;i<s.length();i++) {

            if (ar[s.charAt(i) - 97] == 1)return i;
        }

        return -1;

    }


}

