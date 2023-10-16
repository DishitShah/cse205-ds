import java.util.HashMap;
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (nums == null || nums.length < 2 || k == 0)
            return false;
        HashMap<Integer, Integer> c = new HashMap<>();
        for (int j = 0; j < nums.length; j++) {
            int cur = nums[j];

            if (c.containsKey(cur)) {
                int last = c.get(cur);
                if (j - last <= k) {
                    return true;
                }
            }
            c.put(cur, j);
            if (c.size() > k) {
                int r = nums[j - k];
                c.remove(r);
            }
        }

        return false;
    }
}

