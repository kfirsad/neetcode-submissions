class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int maxArea = 0;

        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++){
                if(grid[i][j] == 1){
                    maxArea = Math.max(maxArea, maxAreaBFS(grid, i, j));
                }
            }
        }
        return maxArea;
    }

    public int maxAreaBFS(int[][] grid, int i, int j){
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[i].length || grid[i][j] == 0){
            return 0;
        }

        grid[i][j] = 0;

        return maxAreaBFS(grid, i + 1, j) + maxAreaBFS(grid, i, j + 1) + maxAreaBFS(grid, i - 1, j) + maxAreaBFS(grid, i, j - 1) + 1;

    }
}
