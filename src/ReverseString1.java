public class ReverseString1 {


    public static void main(String[] args) {
        reverseString("hello".toCharArray());
    }
    public static void reverseString(char[] s) {

        int j = s.length -1;
        for (int i=0;i<s.length;i++,j--) {

            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;

        }

    }
}
