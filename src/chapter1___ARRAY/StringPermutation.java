package chapter1___ARRAY;

public class StringPermutation {

    public static void main(String[] args) {


        String a = "hello";
        String b = "blleh";

        //check if string a is permutation if string b

        if (a.length() != b.length()) System.out.println("NO");

        int[] ca = new int[128];

        for (char c : a.toCharArray()) {
            ca[c]++;
        }


        for (char c : b.toCharArray()) {
            ca[c]--;
            if (ca[c] < 0) System.out.println("NO");
        }

    }

}
