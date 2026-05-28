public class Solution {
    public bool IsValidSudoku(char[][] board) {

        for(int i = 0; i < board.Length; i++){
            HashSet<char> seenRows = new HashSet<char>();
            HashSet<char> seenCols = new HashSet<char>();
            HashSet<char> seenBlocks = new HashSet<char>();

            for(int j = 0; j < board[i].Length; j++){   
                if(board[i][j] != '.'){
                bool testRows = seenRows.Add(board[i][j]);
                    if(!testRows){
                        return false;
                    }
                }
                
                if(board[j][i] != '.'){
                    bool testCols = seenCols.Add(board[j][i]);
                    if(!testCols){
                        return false;
                    }
                }

                int blockRow = (i / 3) * 3 + (j / 3);
                int blockCol = (i % 3) * 3 + (j % 3);

                if(board[blockRow][blockCol] != '.'){
                    bool testBlocks = seenBlocks.Add(board[blockRow][blockCol]);
                    if(!testBlocks){
                        return false;
                    }
                }
            }
        }

        return true;
    }
}
