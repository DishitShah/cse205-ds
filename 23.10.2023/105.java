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
import java.util.*;
class Solution {
    int pre = 0;
    Map<Integer, Integer> map = new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return helper(preorder, 0, preorder.length - 1);
    }
    private TreeNode helper(int[] preorder, int left, int right) {
        if (left > right) {
            return null;
        }
        int rootValue = preorder[pre++];
        TreeNode root = new TreeNode(rootValue);
        root.left = helper(preorder, left, map.get(rootValue) - 1);
        root.right = helper(preorder, map.get(rootValue) + 1, right);
        return root;
    }
}