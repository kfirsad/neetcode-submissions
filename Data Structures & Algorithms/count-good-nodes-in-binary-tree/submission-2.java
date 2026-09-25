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
    public int goodNodes(TreeNode root) {
        return treeTraverse(root, root.val);

    }

    public int treeTraverse(TreeNode node, int maxSoFar){
        int curr = 0;

        if(node == null){
            return 0;
        }

        if(node.val >= maxSoFar){
            curr = 1;
        }

        maxSoFar = Math.max(maxSoFar, node.val);

        int left = treeTraverse(node.left, maxSoFar);
        int right = treeTraverse(node.right, maxSoFar);

        return curr + left + right;

    }
}
