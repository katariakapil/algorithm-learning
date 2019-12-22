public class MinMoveChar3Microsoft {
    public static void main(String[] args) {


        String a = "baaabbaabbba";

        //need to find min move to not have any 3 letter consecutive.
        // u can replace a with b or b with a

        int maxCount = 0;
        int charCount = 0;
        char prev = 'c';

        for (char c: a.toCharArray()) {

            if (c != prev) {
                prev = c;
                charCount = 1;
                continue;
            }
            if (charCount == 2) {

                maxCount++;
                charCount = 0;
            }

            charCount++;


        }

        System.out.println(maxCount);
    }
}
