import java.util.stream.LongStream;

public class SuperDigit {

    public static void main(String[] args) {


        String s = "123";
        int k = 3;

        String n = s.chars().mapToLong(Character::getNumericValue).sum() * k +"";

        while (n.length()>1){

            n = n.chars().mapToLong(Character::getNumericValue).sum()+"";
        }

        System.out.println(n);
    }

    // Complete the superDigit function below.
    static int superDigit(String n, int k) {


        n = n.chars().mapToLong(Character::getNumericValue).sum() * k
                + "";
        return (n.length() > 1) ? superDigit(n, 1) :
                Character.getNumericValue(n.charAt(0));
    }
}
