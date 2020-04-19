public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
            int s = target-nums[i];
            if(map.containsKey(s)&&map.get(s)!=i){
                return new int[]{i,map.get(s)};
            }
        }
        return null;

    }

}
