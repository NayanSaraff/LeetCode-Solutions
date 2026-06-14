class Solution {
    public int searchInsert(int[] nums, int target) {
     int left = 0, right = nums.length - 1;
     int index = -1;

     if(target > nums[right])
     {
        return right+1;
     }
     if(right == 1)
     {
        if(nums[left] < target)
        return left;
     }
        while(left <= right) {
            int mid = (left + right) / 2;

            if (nums[mid] == target)
                return mid;
            else if (target > nums[mid])
                left = mid + 1;
            else
            {
                index = mid;
                right = mid - 1;
            }
        }   
    return index;
    }
}
