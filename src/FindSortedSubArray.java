import java.util.Arrays;

public class FindSortedSubArray {

    public static void main(String[] args) {


        int[] sub = {2, 6, 4, 8, 10, 9, 15};

        int rs = findUnSortedArrayConstantSpace(sub);
        System.out.println(rs);
    }

    public static int findUnSortedArrayConstantSpace(int[] arr) {

        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

        for (int i=1;i<arr.length;i++) {

            if (arr[i] < arr[i -1 ]) {
                min = Math.min(min, arr[i]);
                break;
            }
        }

        for (int i=arr.length -2 ;i>=0;i--) {

            if (arr[i] > arr[i + 1]) {
                max = Math.max(max, arr[i]);
                break;
            }
        }
        //found min and max
        int l;
        for (l=0;l<arr.length;l++){

            if (min < arr[l]){

                break;
            }
        }
        int r;
        for (r=arr.length -1;r>=0;r--){

            if (max > arr[r]){

                break;
            }
        }
        return (r -l) >= 0 ? (r -l) + 1 : 0;

    }

    public static int findUnsortedSubarray(int[] sub) {

        int[] temp = sub.clone(); //clone it otherwise it will sort org array
        Arrays.sort(temp);


        int start = temp.length; // 6
        int end = 0 ; // 0
        for (int i=0;i<temp.length;i++) {

            if (sub[i] != temp[i]) {
                start = Math.min(start, i);
                end = Math.max(end,i);
            }
        }

        System.out.println(end - start >= 0 ? end - start + 1 : 0);

        return (end - start >= 0) ? (end - start + 1) : 0;

    }
}
