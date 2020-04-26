import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;
//1.暴力排序 时间复杂度nlogn 不符合
//2.利用hashmap和堆，空间换时间 nlogk
public class Top_k_frequent_elements {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap();
        for(int i = 0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        PriorityQueue<Integer> pq = new PriorityQueue(new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return map.get(a) - map.get(b);
            }
        });
        int j =0;
        for(Integer key:map.keySet()){
            if(j<k){
                pq.offer(key);
            }
            else{
                if(map.get(key)>map.get(pq.peek())){
                    pq.remove();
                    pq.offer(key);
                }
            }
            j++;
        }
        int[] result = new int[k];
        int i = 0;
        while(!pq.isEmpty()){
            result[i]=(int)pq.remove();
            i++;
        }
        return result;

    }
}
