//动态规划 编辑距离
//动态方程
//动态方程数据结构 dp[i][j]
//动态数据方程 当 word1[i]==word2[j] dp[i][j]=dp[i-1][j-2]
//word1[i]!=word2[j] min(dp[i-1][j-1],dp[i][j-1],dp[i-1][j])
//举例 horse ros d[5][3]
//dp[4][2] hors->ro e->s 替换
//d[5][2] horse->ro 插入s
//d[4][3] hors->ros 删除e

public class EditDistance {

    public int minDistance(String word1, String word2) {
        int length1 = word1.length();
        int length2 = word2.length();
        int[][] dp = new int[length1+1][length2+1];
        char[] chars1 = word1.toCharArray();
        char[] chars2 = word2.toCharArray();
        for(int i=0;i<=length2;i++){
            dp[0][i] = i;
        }
        for(int j=1;j<=length1;j++){
            dp[j][0]=j;
        }
        for(int i=1;i<=length1;i++){
            for(int j=1;j<=length2;j++){
                if(chars1[i-1]==chars2[j-1]){
                    dp[i][j]=dp[i-1][j-1];
                }
                else{
                    dp[i][j] = Math.min(dp[i][j-1],Math.min(dp[i-1][j-1],dp[i-1][j]))+1;
                }
            }
        }
        return dp[length1][length2];
    }
}
