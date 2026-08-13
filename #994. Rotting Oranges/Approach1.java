class Solution {
    public int orangesRotting(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;


        Queue<int[]> list = new LinkedList<>();

        int fresh = 0;

        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                if(grid[i][j] == 2)
                    list.offer(new int[]{i,j});
                else if(grid[i][j] == 1)
                    fresh++;
            }
        }

        if(fresh == 0)
            return 0;
        
        int min = 0;

        int[][] directions = {
            {-1,0},
            {1,0},
            {0,-1},
            {0,1}
        };

        while(!list.isEmpty() && fresh > 0)
        {
            int size = list.size();

            for(int i=0; i<size; i++)
            {
                int[] curr = list.poll();

                for(int[] dir: directions)
                {
                    int newRow = curr[0] + dir[0];
                    int newCol = curr[1] + dir[1];

                    if(newRow >= 0 && newRow < rows &&
                        newCol >= 0 && newCol < cols &&
                        grid[newRow][newCol] == 1)
                        {
                            grid[newRow][newCol] = 2;
                            fresh--;
                            list.offer(new int[]{newRow,newCol});
                        }
                }
            }
            min++;
        }
        return fresh == 0? min:-1;
    }
}
