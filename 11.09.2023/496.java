import java.util.*;
class Solution {
    public static int[] nextGreater(int[] nums){
        int n = nums.length;
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[n];
        for(int i = 0 ; i < n ; i++){
            while(!stack.isEmpty() && nums[i] > nums[stack.peek()]){
                res[stack.peek()] = nums[i];
                stack.pop();
            }
            stack.push(i);
        }
        while(!stack.isEmpty()){
            res[stack.peek()] = -1;
            stack.pop();
        }
        return res;
    }
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] next_gen = new int[nums2.length];
        next_gen = nextGreater(nums2);
        HashMap<Integer , Integer> hash = new HashMap<>();
        for(int i = 0 ; i < next_gen.length ; i++){
            hash.put(nums2[i] , next_gen[i]);
        }
        int[] ans = new int[nums1.length];
        for(int j = 0 ; j < nums1.length ; j++){
            ans[j] = hash.get(nums1[j]);
        }
        return ans;
    }
}

