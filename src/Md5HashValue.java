
import javax.xml.bind.DatatypeConverter;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class Md5HashValue {
    public static void main(String[] args) {


        String password = "ILoveJava";

        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(password.getBytes());
            byte[] digest = md.digest();

            String myhash  = DatatypeConverter.printHexBinary(digest);

            System.out.println(myhash);

            //5F4DCC3B5AA765D61D8327DEB882CF99

            //35454B055CC325EA1AF2126E27707052

            sha256Hash(password);

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }



    }

    public static void sha256Hash (String password) throws NoSuchAlgorithmException {


        MessageDigest md = MessageDigest.getInstance("SHA-256");

        byte[] by = md.digest(password.getBytes(StandardCharsets.UTF_8));

        String hashed = bytesToHex(by);

        System.out.println(hashed);

       String encoded =  Base64.getEncoder().encodeToString(hashed.getBytes());

        System.out.println(encoded);

    }

    private static String bytesToHex(byte[] hash) {
        StringBuffer hexString = new StringBuffer();
        for (int i = 0; i < hash.length; i++) {
            String hex = Integer.toHexString(0xff & hash[i]);
            if(hex.length() == 1) hexString.append('0');
            hexString.append(hex);
        }
        return hexString.toString();
    }
}
