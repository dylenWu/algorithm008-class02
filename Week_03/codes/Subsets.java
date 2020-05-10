import java.util.ArrayList;
import java.util.List;

//1.暴力解法
//2. 找到最小重复逻辑
//回溯法,[a,b,c,d]->[a,b,c]->[a,b,d]->[a,b],[a,c]-....
//[b,c,d]->[b,c],[b,d]...
//[c,d]
public class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(0, nums, res, new ArrayList<Integer>());
        return res;


    }
    private void backtrack(int i, int[] nums, List<List<Integer>> res, ArrayList<Integer> tmp) {
        res.add(new ArrayList<>(tmp));
        for(int j=i;j<nums.length;j++){
            tmp.add(nums[j]);
            backtrack(j+1,nums,res,tmp);
            tmp.remove(tmp.size()-1);
        }
    }
}
