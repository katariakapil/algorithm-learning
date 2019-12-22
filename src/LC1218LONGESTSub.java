import java.util.HashMap;
import java.util.Map;

public class LC1218LONGESTSub {


    public static void main(String[] args) {
//Longest Arithmetic Subsequence of Given Difference

        /*
        Given an integer array arr and an integer difference, return the length of the longest subsequence in arr
        which is an arithmetic sequence such that the difference
         between adjacent elements in the subsequence equals difference.
         */


        int rs = longestSubsequence(new int[]{1,2,3,4}, 1);
        System.out.println(rs);
    }
    public static int longestSubsequence(int[] arr, int d) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int a : arr) {
            mp.put(a , mp.getOrDefault(a -d , 0) + 1);
        }
        int ret = 1;
        for(Map.Entry <Integer, Integer> e : mp.entrySet()) {
            ret = Math.max(ret, e.getValue());
        }
        return ret;
    }
}


