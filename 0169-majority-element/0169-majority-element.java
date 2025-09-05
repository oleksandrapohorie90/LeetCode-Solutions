class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int candidate = -1000000001;
        for(int num : nums){
            //if count of th ecurrent canddate num became 0,
            //pick a new candidate number
            if(count == 0) candidate = num;

            //if current num is the candidate number,
            //increase count by 1
            if(num==candidate) count++;
            //therwise, decrement count by 1. You can think of it
            //like single non-candidate num kills a single candidate number

            else count--;
        }
        //aince there is one numb that appears > n/2 times, it is un-killable.
        //hence, it should win over all other candidates
        return candidate;

    }
}