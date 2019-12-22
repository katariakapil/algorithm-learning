package epi;

public class PalindromeDigit {

    public static void main(String[] args) {

        //check if decimal number is palindrome

        // 157751

        //without extra memory
        int num = 157751;
        //to find number of digit in a integer number
        //  n = (log10n) + 1
        int numofdigit = (int)Math.floor(Math.log10(num)) + 1;

        // start removing from back and front.

        // most significant =  x/10 n-1
        // least significat = x % 10
        int mostsignificatedigit =(int)Math.pow(10, numofdigit -1); // to remove from front

        for (int i=0;i<numofdigit/2;i++) {

            if (num%10 != num/mostsignificatedigit) System.out.println("NOT PALINDROME");

            num %= mostsignificatedigit;
            num /= 10;
            mostsignificatedigit /= 100;
        }

        System.out.println(numofdigit);



    }
}
