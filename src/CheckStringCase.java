public class CheckStringCase {


    public boolean detectCapitalUse(String word) {

        return word.toUpperCase().equals(word) || word.substring(1).toLowerCase().equals(word.substring(1));


    }
}
