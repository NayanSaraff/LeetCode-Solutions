class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int k = 0;

        int maxPile = 0;
        for (int pile : piles) {
            maxPile = Math.max(maxPile, pile);
        }
        
        int left = 1, right = maxPile;
        while(left <= right)
        {
            int mid = left + (right-left)/2;

            long sum = 0;
            for(int i=0;i<piles.length;i++)
            {
                sum += (int)Math.ceil((double)piles[i] / mid);
            }

            if(sum <= h)
            {
                k = mid;
                right = mid - 1;
            }
            else 
                left = mid + 1;
        }
        return k;
    }
}
