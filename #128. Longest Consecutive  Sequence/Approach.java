class Solution {
    public int longestConsecutive(int[] nums) {

        if(nums.length == 0)
        return 0;
        Arrays.sort(nums);

        int max = 1, curr = 1;

        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i+1] == (nums[i]+1))
            curr++;
            else if(nums[i+1] == nums[i])
            continue;
            else
            curr = 1;

            if(curr > max)
            {
                max = curr;
            }
        }
        return max;
    }
}
