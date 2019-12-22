public class IsPalindrome2 {

    public static void main(String[] args) {

        String m = "33blMADAMlb33";


        int l = 0;
        int h  = m.length() -1;

        while (l < h) {


            if (m.charAt(l) != m.charAt(h)){
                System.out.println("FALSE");
                break;
            }

            l++;
            h--;

        }

        System.out.println("TRUE");

    }
}
