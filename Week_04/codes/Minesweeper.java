//采用深度优先遍历
//停止条件为遇到地雷
public class Minesweeper {
    public char[][] updateBoard(char[][] board, int[] click) {
        int rc = board.length;
        int cc = board[0].length;
        int ckr=click[0];
        int ckc=click[1];
        if(board[ckr][ckc]=='M'){
            board[ckr][ckc]='X';
            return board;
        }
        dfs(ckr,ckc,rc,cc,board);
        return board;
    }
    public void dfs(int i,int j,int rc,int cc,char[][] board){
        if(i<0||j<0||i>=rc||j>=cc||board[i][j]!='E'){return;}
        int count=0;
        for(int k=-1;k<2;k++){
            for(int m=-1;m<2;m++){
                if(k==0&&m==0){continue;}
                if(i+k>=0&&j+m>=0&&i+k<rc&&j+m<cc&&board[i+k][j+m]=='M'){
                    count=count+1;
                }
            }
        }
        if(count>0){
            board[i][j]=(char)(count + '0');
        }
        else{
            board[i][j]='B';

            for(int k=-1;k<2;k++){
                for(int m=-1;m<2;m++){
                    if(k==0&&m==0){continue;}
                    if(i+k>=0&&j+m>=0&&i+k<rc&&j+m<cc&&board[i+k][j+m]=='E'){
                        dfs(i+k,j+m,rc,cc,board);
                    }
                }
            }
        }
    }
}
