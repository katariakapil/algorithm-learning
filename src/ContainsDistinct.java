public class ContainsDistinct {


    public int lengthOfLastWord(String s) {

        String[] sr = s.split(" ");
        if (sr.length < 2) return 0;

        return sr[sr.length -1].length();
    }

    public boolean containsNearbyDuplicate(int[] nums, int k) {

        for(int i=0;i<nums.length;i++){

            int x=i;int count=0;

            while(x<nums.length){

                count++;
                x++;
                if(count>k||x==nums.length){
                    break;
                }
                if(nums[i]==nums[x]){
                    return true;

                }
            }
        }
        return false;
    }
}
