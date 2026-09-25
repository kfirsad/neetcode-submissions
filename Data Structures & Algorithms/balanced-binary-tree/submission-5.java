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
    public boolean isBalanced(TreeNode root) {
        if(root == null){
            return true;
        }

        if(isBalanced(root.left) && isBalanced(root.right) && Math.abs(checkHeight(root.left) - checkHeight(root.right)) <= 1){
            return true;
        }else{
            return false;
        }

    }

    public int checkHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftHeight = checkHeight(root.left);
        int rightHeight = checkHeight(root.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }
}
