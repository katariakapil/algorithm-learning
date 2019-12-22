package chapter1___ARRAY;

public class StringCompression {

    public static void main(String[] args) {

        String s = "aaaabbbbcccddeee";

        //Compress String to become a4b4c3d2e3


        StringBuilder sb = new StringBuilder();
        int count = 1;
        for (int i=0;i<s.length();i++) {


            if (i + 1 >= s.length() || s.charAt(i) != s.charAt(i+1)) {

                sb.append(s.charAt(i)).append(count);
                count =0;
            }

            count++;



         }
        System.out.println(sb.toString());

    }
}
