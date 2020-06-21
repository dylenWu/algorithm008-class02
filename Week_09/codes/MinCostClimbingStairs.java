//1.回溯法 但是太麻烦
//2.动态规划，能使用回溯一般可以考虑使用动态规划
//f(n) = cost[n]+ min(f(n-1),f(n-2))

public class MinCostClimbingStairs {
    public int minCostClimbingStairs(int[] cost) {
        int c1 =0;
        int c2=0;
        for(int i=0;i<cost.length;i++){
            int fn = cost[i]+Math.min(c1,c2);
            c1=c2;
            c2=fn;
        }
        return Math.min(c1,c2);
    }
}
