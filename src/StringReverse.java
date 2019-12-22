public class StringReverse {


    public static void main(String[] args) {
        reverseWords("  this is   string reverse   ");
    }
    public static String reverseWords(String s) {
        s = s.trim();
       // while(s.contains("  ")) s=s.replace("  "," ");

        System.out.println(s);

        String[] sr = s.split(" ");

        StringBuilder sb = new StringBuilder();

        for (int i=sr.length -1 ;i>=0;i--) {

            sb.append(sr[i] + " ");

        }

        System.out.println("Final : "+sb.toString().trim());
        return sb.toString().trim();

    }
}
