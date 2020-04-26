import java.util.PriorityQueue;

public class Zui_xiao_de_kge_shu_lcof {
    public int[] getLeastNumbers(int[] arr, int k) {


        PriorityQueue<Integer> pq = new PriorityQueue<>((v1, v2) -> v2 - v1);
        int[] result = new int[k];
        if(k==0) return result;
        for(int i=0;i<arr.length;i++){
            if(i<k){
                pq.offer(arr[i]);
            }
            else {
                if(arr[i]>pq.peek()){
                    continue;
                }
                else{
                    if(arr[i]<pq.peek()){
                        pq.poll();
                        pq.offer(arr[i]);
                    }
                }
            }
        }
        Object[] pds = pq.toArray();
        for(int i=0;i<k;i++){
            result[i] = (int)pds[i];
        }
        return result;
    }

}
