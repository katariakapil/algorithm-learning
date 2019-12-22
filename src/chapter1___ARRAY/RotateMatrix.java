package chapter1___ARRAY;

// TODO: 2019-11-22
public class RotateMatrix {

    public static void main(String[] args) {


        int[][] matrix = new int[3][3];

        for (int r =0;r<matrix.length;r++) {

            for (int c = 0;c<matrix[0].length;c++) {

                matrix[c][r] = 1;

            }

        }

        System.out.println(matrix);

    }
}
