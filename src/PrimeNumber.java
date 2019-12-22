public class PrimeNumber {


    public static void main(String[] args) {

        int num = 7;

        boolean rs = true;
        for (int i=2;i<num -1;i++) {

            if (num%i == 0) {
                rs = false;
                break;
            }
        }
        if (rs) System.out.println("Number is prime");
        else System.out.println("Number is not prime");

    }
}
