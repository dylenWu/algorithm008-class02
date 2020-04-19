import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        ArrayList<List<Integer>> result = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        for(int k=0;k<=nums.length-3;k++){
            int i=k+1;
            int j=nums.length-1;
            if(nums[k]>0){
                continue;
            }
            else if(k>0&&nums[k]==nums[k-1]){
                continue;
            }
            while(i<j){
                int s = nums[k]+nums[i]+nums[j];
                if(s==0){
                    ArrayList<Integer> arr = new ArrayList();
                    arr.add(nums[k]);arr.add(nums[i]);arr.add(nums[j]);
                    result.add(arr);
                    while(i+1<j&&nums[i]==nums[i+1]) i++;
                    while(i<j-1&&nums[j]==nums[j-1]) j--;
                    i++;
                    j--;
                }
                else if(s<0){
                    i++;
                    continue;
                }
                else if(s>0){
                    j--;
                    continue;
                }
            }
        }
        return result;
    }

}
