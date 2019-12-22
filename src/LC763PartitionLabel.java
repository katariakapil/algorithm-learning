import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC763PartitionLabel {

    public static void main(String[] args) {

        String s = "ababcbacadefegdehijhklij";

        //create partition list
        //there will be only small a-z letter
        int [] ar = new int[26];
        for (int i=0;i<s.length();i++)
        {
            //keep last index of character in array
            ar[s.charAt(i) - 'a'] = i;

        }

        int anchor = 0; int j = 0;
        List<Integer> al = new ArrayList();

        for (int i=0;i<s.length();i++) {

             //find the max last position of character
             j = Math.max(j, ar[s.charAt(i) - 'a']);
             //if we are at last index add to list count of split string
             if (i == j) {

                 al.add(i - anchor + 1);
                 anchor = i + 1;
             }

        }
    }
}
