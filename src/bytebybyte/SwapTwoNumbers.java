package bytebybyte;

public class SwapTwoNumbers {

    public static void main(String[] args) {

        int x = 30;
        int y = 50;


        //lets swap these number without extra variable.

        x = x ^ y;

        System.out.println("x>" + x);

        y = x ^ y;

        System.out.println("y>" + y);

        x = x ^ y;

        System.out.println("x" + x);
        System.out.println("y" + y);


    }
}
