public class StringLine {

    public static void main(String[] args) {

        int[] widths = {4,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};

        numberOfLines(widths,"bbbcccdddaaa");
    }

    public static int[] numberOfLines(int[] widths, String S) {

        int lines = 1;
        int width = 0;

        for (char ch : S.toCharArray()) {

            System.out.println(widths[ch - 'a'] + " " + (ch - 'a'));

            width += widths[ch - 'a'];
            if (width > 100) {
                lines++;
                width = widths[ch - 'a'];
            }

        }

        return new int[]{lines,width};
    }

}
