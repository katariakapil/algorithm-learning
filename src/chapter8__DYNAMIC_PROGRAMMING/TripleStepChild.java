package chapter8__DYNAMIC_PROGRAMMING;

public class TripleStepChild {

    public static void main(String[] args) {


        // @todo add memo here next time :)
        // find number of steps required to reach at top
        // a child can take 1 or 2 or 3 steps to reach top.

        //lets say n = 15
        int n = 15;
        int ways = calculateSteps (n);

        System.out.println(ways);
    }

    public static int calculateSteps(int n) {

        if (n < 0) return 0;
        else if (n == 0) return 1;
        else
        return calculateSteps(n -1 ) + calculateSteps( n -2) + calculateSteps( n -3 );
    }
}
