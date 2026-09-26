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
class Solution {
    public boolean isValidBST(TreeNode root) {
        return checkSubTree(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public boolean checkSubTree(TreeNode curr, long min, long max) {
        if (curr == null) {
            return true;
        }

        if (curr.val <= min || curr.val >= max) {
            return false;
        }

        return checkSubTree(curr.left, min, curr.val) && checkSubTree(curr.right, curr.val, max);

    }
}