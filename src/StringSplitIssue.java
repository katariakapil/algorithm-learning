public class StringSplitIssue {

    public static void main(String[] args) {

        String[] ar = "a,,b".split(",");

        System.out.println(ar.length);

        for (String s : ar) {
            System.out.println(s);
        }
    }
}
