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
    int count = 0;
    public int pathSum(TreeNode root, int targetSum) {
        if(root==null) return 0;
        helper(root,0,targetSum);
        pathSum(root.left,targetSum);
        pathSum(root.right, targetSum);
        return count;
    }
    public void helper(TreeNode node,long sum, int targetSum){
        if(node==null) return ;
        sum+= node.val;
        if(sum==targetSum){
            count++;
        }
        helper(node.left,sum,targetSum);
        helper(node.right,sum,targetSum);

    }
}