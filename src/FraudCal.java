import java.util.Arrays;

public class FraudCal {


    public static void main(String[] args) {

        activityNotifications(new int[] {1, 2 ,3 ,4 ,4} , 4);
    }

    static int activityNotifications(int[] expenditure, int d) {

        int notification = 0;
        int c = 0;
        for (int i=d -1 ;i<expenditure.length -1;i++) {

            int [] temp = expenditure;
            int[] sorted = Arrays.copyOfRange(temp, c , d +c);
            Arrays.sort( sorted);
            c++;

            double median;
            if (sorted.length % 2 == 0)
                median = ((double)sorted[sorted.length/2] + (double)sorted                                          [temp.length/2 - 1])/2;
            else
                median = (double) sorted[sorted.length/2];

            if (expenditure[i+1] >= median*2  )
                notification++;

        }

        return notification;


    }

}
