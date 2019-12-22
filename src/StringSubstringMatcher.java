public class StringSubstringMatcher {

    public static void main(String[] args) {


        checkSubstring("kirklandjaea", "williamsjae");


    }

    private static int checkSubstring(String s, String l) {
        int count = 0;
        if (l.length() < s.length())
        {
           return checkSubstring(l , s);
        }

        if (l.contains(s)) {
            System.out.println("found");
            return s.length();
        } else {


            int j = 0;
            int end = 3;
            for (int i=0;i<s.length();i++){

                if (j+end <= s.length()) {
                    String t = s.substring(j, j + end);
                    System.out.println(" Tmp " + t);
                    if (l.indexOf(t) != -1) {
                        System.out.println(" f " + t);
                        end++;
                        count++;
                    } else {
                        j++;
                    }
                }

            }
            System.out.println(count);
        }
        return count;
    }
}
