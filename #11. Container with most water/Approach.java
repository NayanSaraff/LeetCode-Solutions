class Solution {
    public int maxArea(int[] heights) {
        int i=0,j=heights.length-1;
        int max = 0;

        while(i<j)
        {
            int height = Math.min(heights[i],heights[j]);
            int width = j-i;
            int area = height * width;

            if(area > max)
            {
                max = area;
            }

            if(heights[i]<heights[j])
            i++;
            else
            j--;
        }
        return max;
    }
}
