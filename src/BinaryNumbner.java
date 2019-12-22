public class BinaryNumbner {

    public static void main(String[] args) {

        String binp[] = Integer.toBinaryString(5).split("0+");

        for (String s: binp) {
            System.out.println(s);
        }


        System.out.println(Integer.toBinaryString(5));




    }
}
