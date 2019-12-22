public class FindJudge {

    public static void main(String[] args) {
       // int rs = findJudge(4, new int[][]{{1,3},{1,4},{2,3},{2,4},{4,3}});
        int rs = findJudge(4, new int[][] {{1,2},{1,3},{2,1},{2,3},{1,4},{4,3},{4,1}});
        System.out.println(rs);
    }



    private static int findJudge(int N, int[][] dt) {

        int[] trusted = new int[N+1];
        int[] trustee = new int[N+1];
        int maxVotes = N;

        for (int i=0;i<dt.length;i++) {

            int[] ar = dt[i];


            trusted[ar[1]]++;

            if (trusted[maxVotes] < trusted[ar[1]]) {
                maxVotes = ar[1];
            }
            trustee[ar[0]]++;
        }
        if (trusted[maxVotes] == N -1 && trustee[maxVotes] == 0)//check if person got all votes and not in trustee list.
        return maxVotes;

        return -1;

    }
}
