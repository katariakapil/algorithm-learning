public class GoatLatin {

    public static void main(String[] args) {
        toGoatLatin("I speak Goat Latin");
    }

    public static String toGoatLatin(String S) {
        int i=1;
        String fin = "";
        for (String word : S.split(" ")) {


            if (word.startsWith("a") ||
                    word.startsWith("i") ||
                    word.startsWith("o") ||
                    word.startsWith("u") ) {
                word = word + "ma";
            } else {

                char temp = word.charAt(0);
                word = word.substring(1,word.length()) + temp + "ma";
            }

            StringBuilder sb = new StringBuilder();
            for (int j=0;j<i;j++)
                sb.append("a");

            word = word + sb.toString();

            fin += word + " ";
            i++;

        }
        return fin;
    }
}
