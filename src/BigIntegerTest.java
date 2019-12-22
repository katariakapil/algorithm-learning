import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class BigIntegerTest {
    public static void main(String[] args) {

        String[] unsorted = {"1","23424232424234243242424242242424234242"};
        List<BigInteger> list = new ArrayList();
        for (String s : unsorted) {
            list.add(new BigInteger(s));
        }

        System.out.println(list.toArray());
    }
}
