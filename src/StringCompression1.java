public class StringCompression1 {

    public static void main(String[] args) {

        char[] a = "aaabbbbccccdd".toCharArray();
        // a3b4c5
        //compress this string
        StringBuilder sb = new StringBuilder();

        int count = 1;
        for (int i=0;i<a.length -1;i++) {

            if (a[i] == a[i+1]) {
                count++;
            } else {
                sb.append(a[i]).append(count);
                count = 1;
            }
        }
        sb.append(a[a.length -1]).append(count);// dont forget to append this since this will not have last same digit

        System.out.println(sb.toString());
    }
}
