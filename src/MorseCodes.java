import java.util.HashSet;

public class MorseCodes {

    public static void main(String[] args) {


        String[] codes = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        String word = "d";
        int index=word.charAt(0)-'a';
        System.out.println('e' - 'a');
        System.out.println(index);



    }


    public int uniqueMorseRepresentations(String[] words) {

        HashSet<String> unique = new HashSet<>();

        String[] codes = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",
                ".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        for (String word : words){

            StringBuilder morse = new StringBuilder();
            for (int i=0;i<word.length();i++) {

                int index = word.charAt(i) - 'a';
                morse.append(codes[index]);

            }

            unique.add(morse.toString());


        }

        return unique.size();
    }
}
