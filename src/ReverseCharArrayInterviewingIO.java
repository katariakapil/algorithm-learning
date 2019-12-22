public class ReverseCharArrayInterviewingIO {

    public static void main(String[] args) {


        char[] ar =  {'p','r','a','c','t','i','c','e',' ','m','a','k','e','s',' ','p','e','r','f','e','c','t'};

        //reverse this string

        reverseWhole(ar, 0, ar.length -1);
        reverseWords(ar);
        for (char c : ar) {
            System.out.print(c);
        }
    }

    private static void reverseWords(char[] ar) {
        int i = 0;
        int j = ar.length -1;
        int start = 0;

        while (i<j) {

           int index = indexOf(ar, ' ' , start );

           if (index != -1) {

               reverseWhole(ar, start , index -1);
               start = index + 1;
           } else {
               reverseWhole(ar, start , ar.length -1);
           }

            i++;
            j--;

        }
    }

    private static int indexOf(char[] ar, char s, int start) {

        int index = -1;

        for (int i=start;i<ar.length;i++) {
            if (ar[i] == s) return i;
        }

        return index;
    }

    private static void reverseWhole(char[] ar, int i, int j) {

        while (i < j) {
            char c  = ar[i];
            ar[i] = ar[j];
            ar[j] = c;
            i++;
            j--;
        }




    }
}
