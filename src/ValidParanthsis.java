import java.util.*;

public class ValidParanthsis {


    public static void main(String[] args) {

        String str = "{([()])}";

       boolean rs = isBalance(str);

        System.out.println(rs);

    }

    private static boolean isBalance(String str) {
        Map<Character,Character> map = new HashMap<>();

        map.put('{','}');
        map.put('(',')');
        map.put('[',']');

        Stack<Character> stack = new Stack<>();
        Set<Character> openers =  map.keySet();


        for (Character c : str.toCharArray()) {

            if (openers.contains(c)) {

                stack.push(map.get(c));
            } else {

                Character ch = stack.pop();

                if (c != ch) {
                   return false;
                }
            }

        }
        return true;
    }
}
