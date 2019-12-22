public class SecondLargestElement {

    public static void main(String[] args) {

        int [] data = {1,4,7,5,9,8,21,15,3,2};

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i : data) {

            if (i > max) {

                secondMax = max;
                max = i;
            }

            if (i > secondMax && i != max ) {

                secondMax = i;
            }
        }

        System.out.println("Max " + max + " Second Max " + secondMax );

    }
}
