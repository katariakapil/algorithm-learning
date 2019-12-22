public class ReverseString {

    public static void main(String[] args) {


        System.out.println(reverseWords("Let's take LeetCode contest"));
    }

    public static String reverseWords(String s) {

        String[] data = s.split(" ");

        StringBuilder sb = new StringBuilder();

        for (String str : data){

            String reverse = "";
            for (int i=str.length() -1; i>=0;i--) {

                reverse += str.charAt(i);
            }

            sb.append(reverse).append(" ");

        }

        return sb.toString();

    }
}
//s'teL ekat edoCteeL tsetnoc
//s'teL ekat edoCteeL tsetnoc"