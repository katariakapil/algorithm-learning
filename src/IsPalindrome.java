public class IsPalindrome {

    public static void main(String[] args) {

       boolean res = isPalindromeRegularExpression("A man, a plan, a canal: Panama");

        System.out.println(res);
    }

    public static boolean isPalindrome(String s) {

        StringBuilder sb = new StringBuilder();

        for(char c : s.toCharArray()) {

           if (Character.isLetterOrDigit(c)) {
               sb.append(c);
           }
        }


        String s1 = sb.toString().toLowerCase();

        System.out.println(" s1 " + s1);

        String s2 = sb.reverse().toString().toLowerCase();

        System.out.println(" s2 " + s2);


        return s1.equals(s2);
    }

    public static boolean isPalindromeRegularExpression(String s) {


        s = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();

        return new StringBuilder(s).reverse().toString().equals(s);
    }
}
