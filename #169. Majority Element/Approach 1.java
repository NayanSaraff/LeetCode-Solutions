class Solution {
    public int majorityElement(int[] nums) {
        int num;
        int n = nums.length;
        int count = 1,major = 0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(nums[i] == nums[j])
                count++;
            }

            if(count > (n/2))
            {
                major = nums[i];
                return major;
            }
            count = 1;
        }
        return major;
    }
}
