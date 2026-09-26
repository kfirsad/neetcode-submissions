class Solution {
    public boolean exist(char[][] board, String word) {
        int rows = board.length;
        int cols = board[0].length;

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(board[i][j] == word.charAt(0)){
                    if(callDFS(board, i, j, rows, cols, word, 0)){
                        return true;
                    }
                }
            }
        }

        return false;
    }

    public boolean callDFS(char[][] board, int i, int j, int rows, int cols, String word, int letterIndex){
        if(i < 0 || i >= rows || j < 0 || j >= cols || board[i][j] != word.charAt(letterIndex)){
            return false;
        }

        if(letterIndex == word.length() - 1){
            return true;
        }

        char temp = board[i][j];
        board[i][j] = '@';

        int[][] directions = new int[][]{{1,0}, {0,1}, {-1,0}, {0,-1}};

        for(int[] dir : directions){
            int newRow = i + dir[0];
            int newCol = j + dir[1];


            if(callDFS(board, newRow, newCol, rows, cols, word, letterIndex + 1)){
                return true;
            }
        }

        board[i][j] = temp;
        return false;
    }
}