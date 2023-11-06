import java.util.*;
class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        int a=k;
        int i=0;
        while(a-->0)
        {
            pq.add(nums[i++]);
        }
        int currKthMax=0;
        for(i=k;i<nums.length;i++)
        {
            currKthMax=pq.peek();
            if(currKthMax<nums[i])
            {
                pq.poll();
                pq.add(nums[i]);
            }
        }
        return pq.peek();
    }
}