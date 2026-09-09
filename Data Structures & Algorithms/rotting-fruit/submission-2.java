class Solution {
    public int orangesRotting(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        Queue<int[]> queue = new LinkedList<>();
        int minTime = 0;
        int numOfFreshFruits = 0;
        int[][] directions = {{1,0}, {-1,0}, {0,1}, {0,-1}};

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(grid[i][j] == 1){
                    numOfFreshFruits++;
                }else if(grid[i][j] == 2){
                    queue.add(new int[]{i, j});
                }
            }
        }

        while(!queue.isEmpty() && numOfFreshFruits > 0){
            int queueSize = queue.size();
            for(int i = 0; i < queueSize; i++){
                int[] currFruit = queue.poll();
                int currRow = currFruit[0];
                int currCol = currFruit[1];

                for(int dir[] : directions){
                    int newRow = currRow + dir[0];
                    int newCol = currCol + dir[1];

                    if(newRow < 0 || newRow >= rows || newCol < 0 || newCol >= cols || grid[newRow][newCol] != 1){
                        continue;
                    }

                    grid[newRow][newCol] = 2;
                    numOfFreshFruits--;

                    queue.add(new int[]{newRow, newCol});
                }
            }
            minTime++;
        }

        if(numOfFreshFruits > 0){
            return -1;
        }else{
            return minTime;
        }
    }
}
