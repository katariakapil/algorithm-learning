package chapter1___ARRAY;

public class URLRewrite {

    public static void main(String[] args) {

        //write a method to replace space with %20

        String a = "Mr John Smith    ";//have extra space to fill up conversion

        // result a = "Mr%20John%20Smith"

        StringBuilder sb = new StringBuilder();

        for (int i=0;i<a.length();i++) {


            if (a.charAt(i) == ' ') { //found space
                sb.append("%20");
            } else {
               sb.append(a.charAt(i));
            }
        }

        System.out.println(sb.toString().substring(0, a.length()));


    }
}
