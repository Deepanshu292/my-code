class Solution{
    public boolean isSafe(char[][] board,int row,int col,int number)[
        for(int i=0;i<board.length;i++){
            if(board[i][col]=(char)(number+'0')){
                return false;

            }
            if(board[row][i]=(char)(number+'0')){
                return false;
            }
        }
        int sr =(row/3)*3;
        int sc =(col/3)*3;
        for(int i=sr ;i<sr+3;i++){
            for(int j=sc;j<sc+3;j++){
                if(board[i][j]=(char)(number+'0')){
                    return false;
                }
            }
        }
        return true; // Number is safe to place

    }    
    public boolean helper(char[][] board,int row,int col){
        if(nrow==board.length){
            return true; // Reached the end of the board
        } 
        int nrow=0;
        int ncol=0;
        if(col!=board.length()-1){
            nrow=row;
            ncol=col+1;

        }
        else{
            nrow=row+1;
            ncol=0;
        }
        if(board[row][col]!='.'){
            if(helper(board,nrow,ncol)){
                return true;// Move to the next cell
        }
        else{
            for(int i=1;i<=9;i++){
                if(isSafe(board,row,col,i)){
                    board[row][col]=(char)(i+'0');
                    if(helper(board,nrow,ncol)){
                        return true; // Continue to the next cell
                    } else {
                        board[row][col] = '.'; // Backtrack
                    } // Place the number
                }
            }
        }
        return false;

    }
    public void solveSudoku(char[][] board) {
        helper(board, 0, 0);
        
    }  
}
}