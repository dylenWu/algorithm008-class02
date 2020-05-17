
//局部最优的却不是全局最优的
//[5,4,2,1] 8
//[5,2,1] [4,4]
//无法通过先填充最大的再填小的来获得最优解
//只能全部遍历，但是时间复杂度太大
public class CoinChange {
    int res = Integer.MAX_VALUE;
    public int coinChange(int[] coins, int amount) {
        //int[] sCoins =  Arrays.sort(coins);
        findTheWay(coins,amount,0);
        if(res==Integer.MAX_VALUE){
            res=-1;
        }
        return res;
    }
    public void findTheWay(int[] sortedCoins,int amount,int count){
        if(amount<0) {return;}
        if(amount==0){
            res= Math.min(res,count);
        }

        for(int i =0;i<sortedCoins.length;i++){
            //if(amount)
            //amountTotal = amount-sortedCoins[i];

            findTheWay(sortedCoins,amount-sortedCoins[i],count+1);

        }
    }
}
