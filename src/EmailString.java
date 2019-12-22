import java.util.HashSet;

public class EmailString {

    public static void main(String[] args) {


        numUniqueEmails(new String[] {"testemail@leetcode.com","testemail1@leetcode.com","testemail+david@lee.tcode.com"});

    }

    public static int numUniqueEmails(String[] emails) {

        //loop all emails
        //start from back and when found @ first occurence remove all dots and all chars
        //after +

        HashSet<String> unique = new HashSet<>();

        for (int i=0;i<emails.length;i++) {

            String email = emails[i];

            int ind = email.lastIndexOf('@');

            String domainName = email.substring(ind,email.length());
            String emailAdd = email.substring(0,ind);

            emailAdd = emailAdd.replaceAll("\\.","");
            emailAdd = emailAdd.contains("+") ? emailAdd.substring(0, emailAdd.indexOf("+")) : emailAdd;

            unique.add(emailAdd+domainName);


        }

        return unique.size();
    }

}
