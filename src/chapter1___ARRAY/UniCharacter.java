package chapter1___ARRAY;

public class UniCharacter {


    public static void main(String[] args) {

        //check if string has all unique character

       isUnique("aaaaaaaaaaaa");
       isUnique("baaaaaaaaaaa");
       isUnique("");

       if(isUnique("avbert")){
           System.out.println("YES");
       }

    }

    private static boolean isUnique(String s) {
        if (s.length() > 0) {
            boolean[] c = new boolean[128];
            for (int i=0;i<s.length();i++) {
                int index = s.charAt(i);
                if (c[index ]) {
                    System.out.println("NOT UNIQUE");
                    return false;
                }
                c[index] = true;

            }
        }
        return true;
    }
}
