class Solution {
    public int numIslands(char[][] grid) {
        int[][] visited = new int[grid.length][grid[0].length];

        return TotalIsland(grid,visited);
    }

    public int TotalIsland(char[][] grid, int[][] visited)
    {
        int count = 0;

        for(int i = 0; i<grid.length; i++)
        {
            for(int j = 0; j<grid[i].length; j++)
            {
                if(grid[i][j] == '1' && visited[i][j] == 0)
                {
                    dfs(grid,visited,i,j);
                    count++;
                }
            }
        }
        return count;
    }

    public void dfs(char[][] grid, int[][] visited, int i, int j)
    {
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length)
            return;
        
        if(grid[i][j] == '0' || visited[i][j] == 1)
            return;
        
        visited[i][j] = 1;

        dfs(grid,visited,i-1,j);
        dfs(grid,visited,i+1,j);
        dfs(grid,visited,i,j+1);
        dfs(grid,visited,i,j-1);
    }
}
