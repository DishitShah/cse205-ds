import java.util.*;
class Solution {
	public int[] nextGreaterElements(int[] nums) {
		int a = nums.length;
		int size = (a*2) - 1, k = a - 1;
		Stack<Integer> stack = new Stack();
		int[] ans = new int[a];
		Arrays.fill(ans, -1);

		while(size >= 0) {
			int index = size%a;

			while(!stack.isEmpty() && stack.peek() <= nums[index]) 
				stack.pop();

			if(size < a) {
				if(!stack.isEmpty() && stack.peek() > nums[index])
					ans[k] = stack.peek();
				k--;
			}

			stack.push(nums[index]);
			size--;
		}

		return ans;
	}
}
