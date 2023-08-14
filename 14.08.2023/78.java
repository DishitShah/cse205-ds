import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> n = new ArrayList<>();
        n.add(new ArrayList<>());

        for (int i : nums) {
            int a = n.size();
            for (int j = 0; j < a; j++) {
                List<Integer> ans = new ArrayList<>(n.get(j));
                ans.add(i);
                n.add(ans);
            }
        }
        return n;
    }
}
