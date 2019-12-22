package chapter1___ARRAY;

public class IsSubString {
    public static void main(String[] args) {


        //check if string is substring of another string
        // iswaterbottle =  erbottlewat

        String s = "waterbottle";

        String b = "erbottlewat";

        StringBuilder sb  = new StringBuilder(b+b);


        System.out.println(sb.toString());
        System.out.println(sb.toString().contains(s));


    }
}
