public class StringPermutation1 {


    public static void main(String[] args) {

        String s = "abc";

      //  permute("", s);

        permute("", s);

    }

    private static void permute(String prefix, String suffix) {

        if (suffix.length() == 0){
            //once the length of suffix is 0 we reach at end then print the permuation
            System.out.println(prefix);
        } else {

            //a , bc
            for (int i = 0; i < suffix.length() ; i++) {

                //get char at index i and pass as prefix
                // a
                permute(prefix +suffix.charAt(i) ,
                        // "" + bc
                        suffix.substring(0, i) + suffix.substring(i+1));
            }
        }

    }


}
