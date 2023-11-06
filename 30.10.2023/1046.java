import java.util.*;
class Solution {
    public int lastStoneWeight(int[] stones) {
        int n= stones.length;
        if(n==1) return stones[0];
        Queue<Integer> priq = new PriorityQueue<>(Comparator.reverseOrder());
        for(int i=0;i<n;i++)
        {
            priq.offer(stones[i]);
        }
        while(priq.size()>1)
        {
            int a = priq.poll();
            int b = priq.poll();
            int diff = Math.max(a,b) - Math.min(a,b);
            if(diff>0)
                priq.offer(diff);
        }
        int w = 0;
        if(!priq.isEmpty())
        {
            w= priq.poll();
        }
        return w;
    }
}
