class Solution {
    public int findDuplicate(int[] nums) {
        
        int[] indices = new int[nums.length+1];

        for(int i=0;i<nums.length;i++)
        {
            int idx = nums[i] % nums.length;

            indices[idx]++;
        }

        int idx = 0,max = 0;
        for(int i=0;i<indices.length;i++)
        {
            if(indices[i] > max)
            {
                max = indices[i];
                idx = i;
            }
        }
        return idx;
    }
}
