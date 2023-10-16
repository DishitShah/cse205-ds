import java.util.*;

class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] result = new int[2];
        HashMap<Integer, Integer> c = new HashMap<>();

        for (int num : nums) {
            c.put(num, c.getOrDefault(num, 0) + 1);
        }

        for (int i = 1; i <= nums.length; i++) {
            int count = c.getOrDefault(i, 0);
            
            if (count == 0) {
                result[1] = i;  
            } else if (count == 2) {
                result[0] = i;  
            }
        }

        return result;
    }
}

