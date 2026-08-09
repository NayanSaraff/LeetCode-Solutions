class Solution {
    public int maxAreaOfIsland(int[][] grid) {

        int[][] visited = new int[grid.length][grid[0].length];

        return TotalIsland(grid,visited);
    }

    public int TotalIsland(int[][] grid, int[][] visited)
    {
        int area = 0;

        for(int i = 0; i<grid.length; i++)
        {
            for(int j = 0; j<grid[i].length; j++)
            {
                if(grid[i][j] == 1 && visited[i][j] == 0)
                {
                    area = Math.max(area,dfs(grid,visited,i,j));
                }
            }
        }
        return area;
    }

    public int dfs(int[][] grid, int[][] visited, int i, int j)
    {
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length)
            return 0;
        
        if(grid[i][j] == 0 || visited[i][j] == 1)
            return 0;
        
        visited[i][j] = 1;

        int up = dfs(grid,visited,i-1,j);
        int down = dfs(grid,visited,i+1,j);
        int right = dfs(grid,visited,i,j+1);
        int left = dfs(grid,visited,i,j-1);

        return 1 + up + down + right + left;
    }
}
