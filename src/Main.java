
import java.util.*;

public class Main {

    public static void main(String[] args) {


        System.out.println("Hello World!");

        int result = numJewelsInStones("aA","aAAbbbb");

        System.out.println("result " + result);
    }

    public static int numJewelsInStones(String J, String S) {

        HashMap<Character,Integer> map = new HashMap<>();
        int count = 0;
        for (int i=0;i<J.length();i++){

            map.put(J.charAt(i),i);

        }

        for (int i=0;i<S.length();i++) {

            if (map.containsKey(S.charAt(i))) {
                count ++;
            }

        }

        return count;

    }

}
