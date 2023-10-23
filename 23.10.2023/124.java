/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
public class Solution {
    public int maxPathSum(TreeNode root) {
        int[] m = {Integer.MIN_VALUE}; 
        findMaxPathSum(root, m);
        return m[0];
    }
    
    private int findMaxPathSum(TreeNode node, int[] m) {
        if (node == null) return 0;
        int left = Math.max(0, findMaxPathSum(node.left, m));
        int right = Math.max(0, findMaxPathSum(node.right, m));
        m[0] = Math.max(m[0], left + right + node.val);
        return Math.max(left, right) + node.val;
    }
}