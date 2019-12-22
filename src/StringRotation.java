public class StringRotation {

    public static void main(String[] args) {

        System.out.println(rotateString("abcde","cdeab"));

        System.out.println("cdeabcdeab".contains("abcde"));

    }

    public static boolean rotateString(String A, String B) {
        if(A.length() != B.length()) return false;
        if((B + B).contains(A)) return true;
        return false;
    }
}
