class Solution {
    public int orangesRotting(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int minTimes = 0;
        Queue<int[]> queue = new LinkedList<>();
        int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

        int goodOrangesNumber = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1) {
                    goodOrangesNumber++;
                }
                if (grid[i][j] == 2) {
                    queue.add(new int[] {i, j});
                }
            }
        }

        while (!queue.isEmpty() && goodOrangesNumber != 0) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int[] queuePoll = queue.poll();
                int currRows = queuePoll[0];
                int currCols = queuePoll[1];

                for (int[] dir : directions) {
                    int newRows = currRows + dir[0];
                    int newCols = currCols + dir[1];

                    if (newRows < 0 || newRows >= rows || newCols < 0 || newCols >= cols
                        || grid[newRows][newCols] != 1) {
                        continue;
                    }

                    grid[newRows][newCols] = 2;
                    goodOrangesNumber--;
                    queue.add(new int[] {newRows, newCols});
                }
            } minTimes++;
        }

        if (goodOrangesNumber == 0) {
            return minTimes;
        } else {
            return -1;
        }
    }
}
