public class LC1252 {

    public static void main(String[] args) {

        int n = 48, m = 37;
        int[][] indices = {{40,5}};
        int data[][] = new int[n][m];

        int count = 0;

        for (int i=0;i<indices.length;i++) {

            int row = indices[i][0];
            int col = indices[i][1];

            for (int j = 0;j<m;j++){
                data[row][j]++;  //add one to col
            }
            for (int j = 0;j<n;j++){
                data[j][col]++;  //add one to row
            }
        }

        for (int i=0;i<n;i++) {

            for (int j=0;j<m;j++){

                if (data[i][j] % 2 != 0){
                    count++;
                }
            }
        }

        System.out.println(count);
    }



}
