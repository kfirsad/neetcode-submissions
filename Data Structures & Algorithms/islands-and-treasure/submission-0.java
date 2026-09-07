class Solution {
    public void islandsAndTreasure(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        Queue<int[]> queue = new LinkedList<>();
        int[][] directions = {{-1,0}, {1,0}, {0,1}, {0, -1}};

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(grid[i][j] == 0){
                    queue.add(new int[]{i, j});
                }
            }
        }

        while(!queue.isEmpty()){
            int[] curr = queue.poll();
            int r = curr[0];
            int c = curr[1];

            for(int[] dir : directions){
                int newRow = r + dir[0];
                int newCol = c + dir[1];

                if(newRow >= rows || newCol >= cols || newRow < 0 || newCol < 0 || grid[newRow][newCol] != Integer.MAX_VALUE){
                    continue;
                }

                grid[newRow][newCol] = grid[r][c] + 1;
                queue.add(new int[]{newRow, newCol});
            }
        }
    }
}
