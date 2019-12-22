import java.io.*;
import java.util.*;

public class PalindromeCheck {
    // Write your code here.
    Queue<Character> queue = new LinkedList();
    Stack<Character> stack = new Stack();

    void pushCharacter(char c) {
        stack.push(c);
    }
    void enqueueCharacter(char c){
        queue.offer(c);
    }

    Character popCharacter(){
        return stack.pop();
    }
    Character dequeueCharacter(){
        return queue.poll();
    }


    public static void main(String[] args) {

        // Convert input String to an array of characters:
        char[] s = {'m','a','d','a', 'm'};

        // Create a Solution object:
        PalindromeCheck p = new PalindromeCheck();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + ", is "
                + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
}
