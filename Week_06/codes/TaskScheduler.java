import java.util.Arrays;

//这应该是贪心算法，没想到和动态规划有什么关系
public class TaskScheduler {
    public int leastInterval(char[] tasks, int n) {
        int[] map = new int[26];
        for(char c:tasks){
            map[c-'A']++;
        }
        Arrays.sort(map);

        int maxValue=map[25]-1;
        int idelSlots=n*maxValue;
        for (int i = 24; i >= 0 && map[i] > 0; i--){
            int max = Math.min(maxValue,map[i]);
            idelSlots=idelSlots-max;
        }
        return idelSlots>0?tasks.length+idelSlots:tasks.length;
    }
}
