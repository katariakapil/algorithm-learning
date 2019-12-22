import java.util.Arrays;

public class HeightChecker {

    public static void main(String[] args) {

        int[] a = new int[] {1,2,1,2,1,1,1,2,1};
        int count= 0;
        int[] clone = a.clone();

        Arrays.sort(clone);

        for (int i=0;i<a.length;i++){

            if (a[i] != clone[i]) {

                count++;

            }
        }

        System.out.println(count);

        System.out.println(String.format(" Count taken  %s " , bucketSort(a)));
    }


    static int bucketSort(int[] a) {

        int count= 0;

        int[] buckets = new int[101];

        // fill buckets with index value
        for (int index : a){
            buckets[index] += 1;
        }
         int index = 0;
        for (int i=0;i<buckets.length;i++) {
                // 1 < 6
            for (int j = 0;j<buckets[i];j++) {

                if (a[index++] != i)count++;
            }

        }

        return count;
    }

}
