public class ReverseInteger {

    public static void main(String[] args) {
        System.out.println(reverse(23434));
    }

    public static int reverse(int x) {
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        // use long here because reversed number might overflow and needs to be checked
        long reversed = 0;


        while(x != 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x = x / 10;
        }

        // If the reversed number overflows return 0
        if(reversed > max || reversed < min)
            return 0;

        // Cast the long back to an int and return the value
        return (int)reversed;


    }
}
