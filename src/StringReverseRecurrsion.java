public class StringReverseRecurrsion {

    public static void main(String[] args) {

     reverse("hello");


    }

    public static void reverse(String str) {


       char[] res=  helper(0, str.toCharArray());

        System.out.println(res.toString());

        for (char c : res) {
            System.out.println(c);
        }
    }

    private static char[] helper(int i, char[] str) {

        char[] temp = new char[str.length];
        if (str == null || i >= str.length) return null;

        helper(i+1, str);
       temp[i] = str[i];
        return str;
    }
}
