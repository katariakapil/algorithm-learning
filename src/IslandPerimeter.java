public class IslandPerimeter {

    public static void main(String[] args) {

        int[][] data = new int[4][4];
        data = new int[][] {
                {0, 1, 0, 0},
                {1, 1, 1, 0},
                {0, 1, 0, 0},
                {1, 1, 0, 0}
              };

        countPerimiter(data);

    }

    public static int countPerimiter(int[][] data) {

        int count = 0;
        int connected = 0;

        for (int i=0;i<data.length;i++) {

            for (int j=0;j<data[0].length;j++) {
                if (data[i][j] == 1) {
                    count++;
                    if (i!=0 && data[i-1][j] == 1 )connected++;
                    if (j!=0 && data[i][j-1] == 1 )connected++;
                }
            }
        }

        // add all boxes and then remove connected boxes count;
       return count * 4 - connected * 2;


    }
}
