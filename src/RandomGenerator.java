import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class RandomGenerator {


    String alphabet = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    Random rand = new Random();
    Map<String,String> keys = new HashMap();
    // Encodes a URL to a shortened URL.


    public String encode(String longUrl) {
        String key = getRand();
        keys.put(key, longUrl);
        return "http://tinyurl.com/"+key;
    }
    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return keys.get(shortUrl.replace("http://tinyurl.com/",""));
    }

    public String getRand() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            int ind = rand.nextInt(62);
            sb.append(alphabet.charAt(ind));

        }
        if (keys.containsKey(sb.toString())) //to make sure generate random keys always.
        {
            return getRand();
        }

        return sb.toString();
    }
}





