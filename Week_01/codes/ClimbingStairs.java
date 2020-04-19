public class ClimbingStairs {
    public int climbStairs(int n) {
        int memo[] = new int[n + 1];
        int times=0;
        if(n<=2)return n;
        memo[1]=1;
        memo[2]=2;
        return climbStairs(n,memo);

    }
    public int climbStairs(int n,int[]memo){
        if(memo[n]>0) return memo[n];
        else{memo[n]=climbStairs(n-1,memo)+climbStairs(n-2,memo);}
        return memo[n];
    }

}
