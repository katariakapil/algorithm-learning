public class Compare2Strings {
    public static void main(String[] args) {

     String rs =  twoStrings("hello","h1");

        System.out.println(rs);
    }

    // Complete the twoStrings function below.
    static String twoStrings(String s1, String s2) {


        String rs = "NO";

        for (int i=97;i<97+25;i++) {
            if (s1.indexOf(i) != -1 && s2.indexOf(i) != -1)
                rs = "YES";
        }

        return rs;
    }
}
