public class LongestIncreasingSbs {

    public int lengthOfLIS(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int[] dp = new int[nums.length];
        int max = 1;
        for(int i=0;i<nums.length;i++){
            dp[i]=1;
            for(int j=i;j>=0;j--){
                if(nums[i]>nums[j]){
                    dp[i] = Math.max(dp[j]+1,dp[i]);
                }
                //dp[i] = nums[i]>nums[j]?Math.max(dp[j],dp[i]):dp[i];

            }
            max = Math.max(dp[i],max);
        }
        return max;
    }
}
