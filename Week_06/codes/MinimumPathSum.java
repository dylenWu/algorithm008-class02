//子问题 f(m)(n) = min(f(m)(n-1),f(m-1)(n))
//定义状态结构 f(m)(n)
//定义动态方程
public class MinimumPathSum {
    public int minPathSum(int[][] grid) {
        int r=grid.length-1;
        int c=grid[0].length-1;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(i==0&&j==0) continue;
                else if(i==0){
                    grid[i][j]=grid[i][j]+grid[i][j-1];
                }
                else if(j==0){
                    grid[i][j]=grid[i][j]+grid[i-1][j];
                }
                else{
                    grid[i][j]=Math.min(grid[i-1][j],grid[i][j-1])+grid[i][j];
                }
            }
        }
        return grid[r][c];
    }
}
