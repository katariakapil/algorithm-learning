package chapter6__MATH_PUZZLE;

public class PrimeNumbers {

    /**
     * All non-prime numbers are divisible by prime numbers = theory by Sieve of Eratosthenes
     * @param args
     */
    public static void main(String[] args) {

        int max = 15;
        boolean[] flags = new boolean[max + 1];

        //set all to true
        for (int i=2;i<flags.length;i++) {
            flags[i] = true;
        }

        int prime = 2;

        while (prime <= Math.sqrt(max)) {

            crossOff(flags, prime);
            prime = getNextPrime(flags, prime);

        }

        int k = 0;
        for (boolean b : flags) {

            if (b)System.out.println("FLAG  " +b + " k = " + k);
            k++;
        }
    }

    // all number divisble by 2 just mark them false..
    private static void crossOff(boolean[] flags, int prime) {
        for (int i = prime * prime; i < flags.length; i  += prime) {
            flags[i] = false;
        }
    }

    static int getNextPrime(boolean[] flags , int prime ){

        int next = prime + 1;
        while (next < flags.length && !flags[next]){
            next++;
        }
        return  next;
    }
}
