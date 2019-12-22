public class XORSearch {

    public static void main(String[] args) {


        int[] data = {1,2,1,2,3,4,4,3,5};

        int unique = 0;
        for (int i: data) {

            unique ^= i;
            System.out.println("i "+i +  "uniq "+ unique );
        }

        System.out.println(unique);
        //will print 5
        // Every time we XOR with a new ID, it will change the bits. When we XOR with the same ID again, it will cancel
        // out the earlier change.
    }
}
