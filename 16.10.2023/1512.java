import java.util.HashMap;
class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> c = new HashMap<>();
        int result = 0;

        for (int num : nums) {
            c.put(num, c.getOrDefault(num, 0) + 1);
            result += c.get(num)-1;
        }

        return result;
    }
}
