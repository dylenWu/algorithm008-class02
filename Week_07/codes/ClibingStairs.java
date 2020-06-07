//dfs 剪支
//尽可能减少递归的深度，可以在终止条件上进行操作


class ClibingStairs {
    public int climbStairs(int n) {
        int[]mem=new int[n+1];
        int total = dfs(n,mem);
        return total;


    }
    public int dfs (int n,int[]mem){
        if(n==1) return 1;
        if(n==2) return 2;
        if(mem[n]!=0) return mem[n];
        int total = dfs(n-1,mem)+dfs(n-2,mem);
        mem[n]=total;
        return total;
    }

}

