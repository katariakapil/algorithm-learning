import java.util.HashMap;

public class LC535_EncodeDecodeTinyURL {

    public static void main(String[] args) {


        String longUrl =  "https://leeetcode.com/problem/data/getLongURLsdfsfsfssdfsfsffsfsfsfssfssfs";


        HashMap<String,String> map = new HashMap<>();
        System.out.println(longUrl.hashCode());
        String shortUrl = Integer.toHexString(longUrl.hashCode());
        System.out.println(shortUrl);

        map.put(shortUrl, longUrl);

        System.out.println(map.get(shortUrl));

    }
}
