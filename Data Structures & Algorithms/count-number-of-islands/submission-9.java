class Solution {
    public int numIslands(char[][] grid) {
        int count = 0;

        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == '1'){
                    count++;
                    callBFS(i, j, grid);
                }
            }
        }

        return count;
    }

    public void callBFS(int i, int j, char[][] grid){
        int rows = grid.length;
        int cols = grid[0].length;
        int[][] directions = {{1,0}, {-1,0}, {0,1}, {0,-1}};

        if(i >= rows || i < 0 || j >= cols || j < 0 || grid[i][j] == '0'){
            return;
        }

        grid[i][j] = '0';

        for(int[] dir : directions){
            callBFS(i + dir[0], j + dir[1], grid);
        }          
    }
}
