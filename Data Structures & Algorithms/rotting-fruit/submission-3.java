class Solution {
    public int orangesRotting(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int minTime = 0;
        Queue<int[]> queue = new LinkedList<>();
        int numOfFreshOranges = 0;
        int[][] directions = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1) {
                    numOfFreshOranges++;
                }

                if (grid[i][j] == 2) {
                    queue.add(new int[] {i, j});
                }
            }
        }

        if (numOfFreshOranges == 0) {
            return 0;
        }

        while (!queue.isEmpty() && numOfFreshOranges > 0) {
            int size = queue.size();
            for(int k = 0; k < size; k++){
                int[] currCell = queue.poll();
                int currRow = currCell[0];
                int currCol = currCell[1];

                for (int[] dir : directions) {
                    int newRow = currRow + dir[0];
                    int newCol = currCol + dir[1];

                    if (newRow >= rows || newRow < 0 || newCol >= cols || newCol < 0
                        || grid[newRow][newCol] != 1) {
                        continue;
                    }

                    grid[newRow][newCol] = 2;
                    numOfFreshOranges--;
                    queue.add(new int[] {newRow, newCol});
                }
            } minTime++;
        }

        if(numOfFreshOranges > 0){
            return -1;
        }
        return minTime;
    }
}
