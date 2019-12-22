package core_java;

public class GetCharFromNumber {

    public static void main(String[] args) {

        int n = 701;
        String sb = convertToTitle(n);
        System.out.println(sb);


    }

    public static String convertToTitle(int n) {
        if (n <= 0) {
            return "";
        }
        StringBuffer sb = new StringBuffer();
        while (n > 0) {
            System.out.println('A' + (n - 1) % 26);
            sb.insert(0, (char) ('A' + (n - 1) % 26));
            n = (n - 1) / 26;
            System.out.println(">>>" + n);
        }
        return sb.toString();
    }
}
