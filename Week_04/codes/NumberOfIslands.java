public class NumberOfIslands {
    public int numIslands(char[][] grid) {
        if(grid.length==0){return 0;}
        int rc = grid.length;
        int cc = grid[0].length;
        int result = 0;
        for(int i=0;i<rc;i++){
            for(int j=0;j<cc;j++){
                if(grid[i][j]=='1'){
                    dfs(i,j,rc,cc,grid);
                    result=result+1;
                }
            }
        }
        return result;
    }
    public void dfs(int i,int j,int rc,int cc,char[][] grid){
        if(i<0||j<0||i>=rc||j>=cc||grid[i][j]=='0'){
            return;
        }
        grid[i][j]='0';
        dfs(i+1,j,rc,cc,grid);
        dfs(i,j+1,rc,cc,grid);
        dfs(i-1,j,rc,cc,grid);
        dfs(i,j-1,rc,cc,grid);
    }
}
