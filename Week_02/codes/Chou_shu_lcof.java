import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class Chou_shu_lcof {
    public int nthUglyNumber(int n) {
        PriorityQueue<Long> pq = new PriorityQueue<>();
        Set<Long> s = new HashSet<>();
        long[] prim = {2,3,5};
        long num =1;
        pq.offer(num);
        for(int i =0;i<n;i++){
            num=pq.poll();
            for(int j=0;j<3;j++){
                if(!s.contains(num*prim[j])){
                    s.add(num*prim[j]);
                    pq.offer(num*prim[j]);
                }
            }

        }
        return (int)num;
    }
}
