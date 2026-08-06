class Solution {
    public int islandPerimeter(int[][] grid) {
        int maxparameter = 0;

        for (int i =0 ; i< grid.length ; i++){
            for(int j = 0 ; j < grid[i].length ; j++){
                maxparameter += 4 * grid[i][j];
                if(i>0 ){
                    maxparameter -= 2*grid[i-1][j]*grid[i][j];
                    
                }
                if(j>0){
                    maxparameter -= 2*grid[i][j-1]*grid[i][j];
                }
                
            }
        }
        return maxparameter;
        
    }
}
