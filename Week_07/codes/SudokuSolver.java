
class SudokuSolver {
    public void solveSudoku(char[][] board) {
        dfs(board);
    }
    public boolean dfs(char[][] board){


        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='.'){
                    for(char s='1';s<='9';s++){
                        board[i][j]=s;
                        if(isValid(board,i,j)){
                            if(dfs(board)){
                                return true;
                            }
                            else{
                                continue;
                            }

                        }
                        //board[i][j]='.';

                    }
                    board[i][j]='.';
                    return false;

                }
            }
        }

        return true;
    }



    public boolean isValid(char[][] board,int r,int c){


        char s = board[r][c];
        for(int i=0;i<9;i++){
            if(i!=c&&board[r][i]==s) return false;
            if( i!=r&&board[i][c]==s) return false;
            int bor =r/3*3+i/3;
            int boc =c/3*3+i%3;
            if( board[bor][boc]==s&&boc!=c&&bor!=r) return false;

        }
        return true;
    }
}
