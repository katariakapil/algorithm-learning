import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CookieDis {

    //455. Assign Cookies
    public static void main(String[] args) {
        findContentChildren(new int[]{1,2}, new int[]{1,2,3});
    }

    public static int findContentChildren(int[] greed, int[] cookie) {
        Arrays.sort(greed);
        Arrays.sort(cookie);


        int count = 0;

        for (int j = 0; count < greed.length && j < cookie.length; j++) {
            if (cookie[j] >= greed[count]) count++;
        }
        return count;

    }
}
