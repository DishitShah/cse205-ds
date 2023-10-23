import java.util.*;

class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int[] array = new int[k];
        PriorityQueue<Integer> p = new PriorityQueue<>(Collections.reverseOrder());
        ArrayList<Integer> arr = new ArrayList<Integer>();
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int tot = 0;
        int z = 0;

        for (int i = 0; i < nums.length; i++) {
            p.add(nums[i]);
            arr.add(nums[i]);

        }

        for (int i = 0; i < k; i++) {

            int b = p.remove();
            if (map.containsKey(b)) {
                int a = map.get(b);
                map.remove(b);
                map.put(b, a + 1);
            } else {
                map.put(b, 1);
            }

        }

        for (int i = 0; i < nums.length; i++) {
            if (z == k) {
                break;
            }
            if (map.containsKey(arr.get(i))) {
                array[z] = arr.get(i);
                if (map.get(arr.get(i)) > 1) {
                    int a = map.get(arr.get(i));
                    map.remove(arr.get(i));
                    map.put(arr.get(i), a - 1);
                } else {
                    map.remove(arr.get(i));
                }
                z++;
            }
        }

        return array;

    }
}