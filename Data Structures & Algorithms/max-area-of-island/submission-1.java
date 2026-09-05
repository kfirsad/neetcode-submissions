class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int maxArea = 0;

        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++){
                if(grid[i][j] == 1){
                    maxArea = Math.max(maxArea, maxAreaDFS(grid, i, j));
                }
            }
        }
        return maxArea;
    }

    public int maxAreaDFS(int[][] grid, int i, int j){
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[i].length || grid[i][j] == 0){
            return 0;
        }

        grid[i][j] = 0;

        return maxAreaDFS(grid, i + 1, j) + maxAreaDFS(grid, i, j + 1) + maxAreaDFS(grid, i - 1, j) + maxAreaDFS(grid, i, j - 1) + 1;

    }
}
