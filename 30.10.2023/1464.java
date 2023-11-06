import java.util.*;

class Solution {
    public int maxProduct(int[] nums) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(nums.length, Collections.reverseOrder());
        for (int num : nums) {
            maxHeap.add(num);
        }
        int largest1 = maxHeap.poll();
        int largest2 = maxHeap.poll();
        
        return (largest1 - 1) * (largest2 - 1);
    }
}

