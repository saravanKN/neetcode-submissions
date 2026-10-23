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
    public int maxDepth(TreeNode root) {
        return findDepth(root, 0);
    }

    int findDepth(TreeNode root, int count){
        if(root == null){
            return count;
        }
        count = count+1;
        int left = findDepth(root.left , count);
        int right = findDepth(root.right, count);
        return Math.max(left,right);
    }
}
