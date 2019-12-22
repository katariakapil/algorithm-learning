public class ReverseStringPairs {

    public static void main(String[] args) {


        reverseStr("bacdfeghefg", 3);

    }

    public static String reverseStr(String s, int k) {

        char[] a = s.toCharArray();

        for (int i=0;i<a.length; i += 2*k) {

            int l = i;
            int h = Math.min(i + k -1, a.length -1 );

            System.out.println(" L > "+l);
            System.out.println(" H > "+h);

            while (l < h) {

                char temp = a[l];
                a[l++] = a[h];
                a[h--] = temp;

            }
        }

        return new String(a);

    }



}
