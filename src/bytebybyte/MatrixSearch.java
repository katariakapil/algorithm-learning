package bytebybyte;

public class MatrixSearch {

    public static void main(String[] args) {

        /**
         *
         *          0   1   2   3
         *          4   5   6   7
         *          8   9   10  11
         *          12  13  14  15
         */

        int[][] matrix = new int[4][4];

        matrix[0][0] = 0;
        matrix[0][1] = 1;
        matrix[0][2] = 2;
        matrix[0][3] = 3;

        matrix[1][0] = 4;
        matrix[1][1] = 5;
        matrix[1][2] = 6;
        matrix[1][3] = 7;

        matrix[2][0] = 8;
        matrix[2][1] = 9;
        matrix[2][2] = 10;
        matrix[2][3] = 11;

        matrix[3][0] = 12;
        matrix[3][1] = 13;
        matrix[3][2] = 14;
        matrix[3][3] = 15;


        for (int i =0;i<matrix.length;i++) {

            for (int j =0;j<matrix.length;j++) {

                System.out.print(matrix[i][j] + " ");
            }

            System.out.println();

        }

        //search for 9 in matrix now/

        //Brute force is binary search each row.  The runtime for this algorithm would be O( rows * log(n) )
        // Optimum solution for binary search would be 2D binary search but would be little complicated.


        // Easy and best solution would be look at upper bound and lower bound of row and discard the row.




        int taget = 9;
        int row = 0;
        int col = matrix[0].length -1;

        while (row < matrix[0].length && col >=0 ) {

            if (matrix[row][col] == taget) {
                System.out.println("FOUND ELEMENT "+ taget + " ROW "+ row + " COL "+ col);
            }

            if (matrix[row][col] < taget) {
                //discard the row since target value is greater and should not exists
                // in this row
                row++;
            } else {
                col--;
            }

        }
    }
}
