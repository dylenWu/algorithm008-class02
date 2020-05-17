public class SearchSortedArr {
    //二分的本质在于切分
    //1.单调 2.有界 3.索引
    public int search(int[] nums, int target) {
        int left =0 ;
        int right=nums.length-1;
        while(left<=right){//不能等于，死循环
            int mid = left+(right-left)/2;
            if(nums[mid]==target){
                return mid;
            }
            if(nums[left]<=nums[mid]){
                if(target<nums[mid]&&target>=nums[left]){
                    right=mid-1;
                }
                else{
                    left=mid+1;
                }
            }
            else if(nums[left]>nums[mid]){
                if(nums[mid]<target&&nums[right]>=target){
                    left=mid+1;
                }
                else{
                    right=mid-1;
                }
            }


        }
        return -1;
    }
}
