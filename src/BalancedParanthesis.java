import java.util.*;

public class BalancedParanthesis {
    public static void main(String[] args) {

        System.out.println(isBalanced("{[[{()}]]}"));

    }
    static boolean isBalanced(String str) {

        Map<Character,Character> map = new HashMap<>();

        map.put('{','}');
        map.put('[',']');
        map.put('(',')');

        Set<Character> openrs = map.keySet();

        Stack<Character> stack = new Stack();

        for (Character c  : str.toCharArray()) {

            //check if bracket is opener then add in stack
            if (openrs.contains(c)) {
                stack.push(c);
            } else { //check if bracket is closer then

                if (stack.isEmpty()) return false;
                else {
                    Character ch = stack.pop();
                    if (map.get(ch) != c) {//get char n check
                        return false;
                    }
                }

            }

        }


        return stack.isEmpty();//this will return true if removed all
    }
}
