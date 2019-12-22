public class LC807 {

    public static void main(String[] args) {

        int[][] grid = {{3, 0, 8, 4},
                {2, 4, 5, 7},
                {9, 2, 6, 3},
                {0, 3, 1, 0}} ;

        maxIncreaseKeepingSkyline(grid);
    }

    public static int maxIncreaseKeepingSkyline(int[][] grid) {

        int n = grid.length;
        int[] row = new int[n];
        int[] col = new int[n];

        for (int i=0;i<n;i++) {
            for (int j =0;j<n;j++) {
                row[i] = Math.max(row[i], grid[i][j]);
                col[j] = Math.max(col[j], grid[i][j]);
            }
        }
        //found row and col max elements in grid , now just use the min of two and subtract from grid number to get
        // how much we can increase

        int ans = 0;
        for (int i=0;i<n;i++) {
            for (int j=0;j<n;j++) {
                ans += Math.min(row[i], col[j]) - grid[i][j];
            }
        }
        return ans;
    }
}
