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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> l = new ArrayList<>();
        rightSide(root, 1, l);
        return l;
    }

    int maxLevel = 0;
    public void rightSide(TreeNode root, int level, List<Integer> l){
        if(root == null)
            return;

        if(maxLevel < level)
        {
            l.add(root.val);
            maxLevel = level;
        }
        rightSide(root.right, level + 1, l);
        rightSide(root.left, level + 1, l);
    }
}