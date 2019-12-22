import java.util.HashSet;
import java.util.Set;

public class MissingElementInArray {

    public static void main(String[] args) {

        int[] a = {1,2,4,5,6,63,632,66,7};
        int[] b = {1,2,4,5,6,632,66,7};

        Set<Integer> set = new HashSet<>();

        for (int i : b) {
            set.add(i);
        }

        for (int i: a) {

            if (!set.contains(i)) {
                System.out.println(i);//found missing element
            }
        }

        //using constant space
        int xor = 0;
        for (int i: a) {
             xor ^= i;
            System.out.println("val " + xor);
        }
        System.out.println("\n");
        for (int i: b) {
            xor ^= i;
            System.out.println("new VAL  " + xor);
        }
        System.out.println(xor);
    }
}
