public class RoateArray {
    // public void rotate(int[] nums, int k) {
    //     int temp;int pre;
    //     for(int i=0;i<k;i++){
    //         pre=nums[nums.length-1];
    //         for(int j=0;j<nums.length;j++){
    //             temp=nums[j];
    //             nums[j]=pre;
    //             pre=temp;
    //         }
    //     }
    // }
    public void rotate(int[] nums, int k) {
        reverse(0,nums.length-1,nums);
        reverse(0,(k%nums.length)-1,nums);
        reverse(k%nums.length,nums.length-1,nums);
    }
    public void reverse(int start,int end,int[]nums){
        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }


}
