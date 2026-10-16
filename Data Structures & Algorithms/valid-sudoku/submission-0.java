class Solution {
    public boolean isValidSudoku(char[][] board) {

        Set<String> sudokuSet = new HashSet();
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                char value = board[i][j];
                if(value!='.'){
                    if(!sudokuSet.add(value+" in row "+i)||
                        !sudokuSet.add(value+" in column "+j)||
                        !sudokuSet.add(value+" in box "+i/3+"-"+j/3)){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
