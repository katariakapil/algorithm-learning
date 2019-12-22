public class DoubleArray {

    public static void main(String[] args) {


        int[][] matrix = new int[3][3];

        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[0][2] = 3;


        boolean[] data = new boolean[26];

        for (char c : "abcdefghijk".toCharArray()){


            data[c - 'a' ] = true;

        }

        System.out.println(data);

    }
}
