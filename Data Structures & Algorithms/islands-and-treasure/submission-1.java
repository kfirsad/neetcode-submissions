class Solution {
    public void islandsAndTreasure(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        Queue<int[]> queue = new LinkedList<>();
        int maxInt = Integer.MAX_VALUE;
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
            int currRow = curr[0];
            int currCol = curr[1];

            for(int[] dir : directions){
                int newRow = currRow + dir[0];
                int newCol = currCol + dir[1];

                if(newRow >= rows || newRow < 0 || newCol >= cols || newCol < 0 || grid[newRow][newCol] != maxInt){
                    continue;
                }

                grid[newRow][newCol] = grid[currRow][currCol] + 1;
                queue.add(new int[]{newRow, newCol});
            }
        }
    }
}
