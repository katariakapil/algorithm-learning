public class ReverseStringWithSpecialChar {

    public static void main(String[] args) {

        System.out.println(reverseOnlyLetters("78-]"));
    }

    public static String reverseOnlyLetters(String S) {

        //take two pointers start and end
        int i = 0;
        int j = S.length() -1;
        char[] data = S.toCharArray();

        while (i < j) {

            if (!Character.isLetter(data[i])) {
                i++;
            }
            else if (!Character.isLetter(data[j])) {
                j--;
            } else
            swap(data, i++ , j--);


        }

        return new String(data);


    }

    static void swap(char[] data, int i, int j) {

        char temp = data[i];
        data[i] = data[j];
        data[j] = temp;

    }
}
