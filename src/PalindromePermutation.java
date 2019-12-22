import java.util.HashSet;

public class PalindromePermutation {

    public static void main(String[] args) {


        System.out.println(isPalindromePermuationPossible("madam"));
        System.out.println(isPalindromePermuationPossible("dogd"));

    }

    /**
     * If a string with an even length is a palindrome, every character in the string must always occur an even number
     * of times. If the string with an odd length is a palindrome, every character except one of the characters must
     * always occur an even number of times. Thus, in case of a palindrome, the number of characters with odd number
     * of occurences can't exceed 1(1 in case of odd length and 0 in case of even length).
     * @param s
     * @return
     */
    static boolean isPalindromePermuationPossible(String s) {

        HashSet<Character> data = new HashSet();

        for (int i=0;i<s.length();i++) {

            if (!data.add(s.charAt(i))) {
                data.remove(s.charAt(i));
            }
        }

        return data.size() <= 1;//means there are more elements with Odd which mean string palindrome not possible.
    }
}
