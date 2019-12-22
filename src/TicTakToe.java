import java.util.Random;

public class TicTakToe {

    public static void main(String[] args) {

        char[][] d = new char[3][3];

        for (int i=0;i<d.length;i++) {

            for (int j =0;j<d[i].length;j++) {
                d[i][j] = 'x';
            }
        }


        print(d);

        char x = '0';
        for (int i=0;i<9;i++) {

            if (i%2==0) x = 'x';
            int[] random = getNextRandom(d, x);

            int row = random[0];
            int col = random[1];

            d[row][col] = x;
        }

        System.out.println();

        print(d);

    }

    private static int[] getNextRandom(char[][] d, char ra) {


        Random r = new Random();
        int row = r.nextInt(3);
        int col = r.nextInt(3);

        System.out.println("getting random");

        if (d[row][col] == ra) return getNextRandom(d, ra);

        return new int[]{row,col};
    }

    private static void print(char[][] d) {
        for (int i=0;i<d.length;i++) {

            for (int j =0;j<d[i].length;j++) {
                System.out.print(d[i][j]);
            }
            System.out.println();
        }
    }
}
