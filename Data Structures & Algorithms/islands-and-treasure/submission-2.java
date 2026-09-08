class Solution {
    public void islandsAndTreasure(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int maxInt = Integer.MAX_VALUE;
        Queue<int[]> queue = new LinkedList<>();
        int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 0) {
                    queue.add(new int[] {i, j});
                }
            }
        }

        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            int currRows = curr[0];

            int currCols = curr[1];
            for (int[] x : directions) {
                int newRows = currRows + x[0];
                int newCols = currCols + x[1];

                if (newRows < 0 || newRows >= rows || newCols < 0 || newCols >= cols
                    || grid[newRows][newCols] != maxInt) {
                    continue;
                }
                
                grid[newRows][newCols] = grid[currRows][currCols] + 1;
                queue.add(new int[] {newRows, newCols});
            }
        }
    }
}
