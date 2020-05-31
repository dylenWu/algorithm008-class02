public class UniquePaths {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if(obstacleGrid[0][0]==1){
            return 0;
        }
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        boolean fitstR=false;
        boolean fitstC=false;
        for(int i =0;i<n;i++){
            //obstacleGrid[0][i]=fitstR?0:1;
            if(obstacleGrid[0][i]==1){
                obstacleGrid[0][i]=0;
                fitstR=true;
            }
            else if(fitstR) {
                obstacleGrid[0][i]=0;
            }
            else{
                obstacleGrid[0][i]=1;
            }}

        for(int j =1;j<m;j++){
            if(obstacleGrid[j][0]==1){
                obstacleGrid[j][0]=0;
                fitstC=true;
            }
            else if(fitstC) {
                obstacleGrid[j][0]=0;
            }
            else{
                obstacleGrid[j][0]=1;
            }}
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                obstacleGrid[i][j] = obstacleGrid[i][j]==1?0:obstacleGrid[i-1][j]+obstacleGrid[i][j-1];
            }
        }
        return obstacleGrid[m-1][n-1];
    }
}
