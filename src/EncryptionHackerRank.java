public class EncryptionHackerRank {

    public static void main(String[] args) {

        String s = "haveaniceday";

        int row = (int)Math.floor(Math.sqrt(s.length()));
        int col = (int)Math.ceil(Math.sqrt(s.length()));

        System.out.println("row"+ row+"col"+col);

        int len = row * col;
        System.out.println(len);

        StringBuilder sb = new StringBuilder();

        for (int i=0;i<col;i++) {


            for (int j = i;j<s.length();j += col) {

                sb.append(s.charAt(j));

            }

        }
        System.out.println(sb.toString());


    }
}
