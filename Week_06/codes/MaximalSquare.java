//分解子问题，dp[m][n]=min(dp[m-1][n],dp[m],[n-1],dp[m-1][n-1])+1
//定义状态结构
//定义动态方程
public class MaximalSquare {
    public int maximalSquare(char[][] matrix) {
        if(matrix.length==0) return 0;
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] dp = new int[m+1][n+1];
        int max=0;
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(matrix[i-1][j-1]=='1'){
                    dp[i][j] = Math.min(Math.min(dp[i-1][j],dp[i][j-1]),dp[i-1][j-1])+1;
                    max = Math.max(max,dp[i][j]);
                }
            }
        }
        return max*max;
    }
}
