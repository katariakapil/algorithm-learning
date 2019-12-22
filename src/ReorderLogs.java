import java.util.Arrays;

public class ReorderLogs {

    public static void main(String[] args) {

        String[] arr= {"a1 9 2 3 1","g1 act car","zo4 4 7","ab1 off key dog","a8 act zoo"};
        reorderLogFiles(arr);

    }

    public static String[] reorderLogFiles(String[] logs) {

        Arrays.sort(logs, (l1 , l2) -> {

            String[] s1 = l1.split(" ", 2);
            String[] s2 = l2.split(" ", 2);


            boolean isDigit1 = Character.isDigit(s1[1].charAt(0));
            boolean isDigit2 = Character.isDigit(s2[1].charAt(0));

            //check letters
            if (!isDigit1 && !isDigit2) {

                int compare = s1[1].compareTo(s2[1]);
                if (compare != 0) return compare;
                return s1[0].compareTo(s2[0]);
            }

            return isDigit1 ? (isDigit2 ? 0 :1) : -1;

        });

        return logs;
    }
}
