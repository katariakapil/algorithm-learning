package lc_question;

public class SmallestLeter744 {

    public static void main(String[] args) {


        char [] c = {'c', 'f', 'j'};
        char target = 'k';

        //find smallest element larger than given target.

        int low = 0;
        int high = c.length - 1;

        while (low < high) {

            int mid = low + (high -low)/2;

            if (c[mid] >= target) {
                // mid item is greater we should search in
                // left area
                high = mid -1;
            } else {
                low = mid +1;
            }

        }
        System.out.println("low>>"+low);

        System.out.println("high>>"+high);

        // At the end, if our insertion position says to insert target into the last position letters.length,
        // we return letters[0] instead.
        System.out.println(c[low % c.length]);
    }
}
