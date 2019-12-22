public class ArrayIsMountain {

    public static void main(String[] args) {

        isMountain(new int[] {0,3,2,1});

    }

    /**
     *          3
     *              2
     *       0           1
     *
     *
     * @param a
     */

    private static void isMountain(int[] a) {

        int i = 0;

        int n = a.length -1;


        while (i < n && a[i] < a[i+1]) {
            i++;
        }

        System.out.println("i is "+i);

        if (i == 0 || i == n)
        {
            System.out.println("Not a mountain since it cannot be at 0 or last index");
        }

        while (i<n && a[i] > a[i+1]) {
            i++;

        }

        System.out.println("i final "+i);

        if (n == i) {
            System.out.println("Its a mountain ");
        }

    }
}
