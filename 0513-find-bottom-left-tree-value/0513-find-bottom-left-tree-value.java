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
    static int maxDepth;
    static int ans;
    public int findBottomLeftValue(TreeNode root) {
        maxDepth = -1;
        ans = 0;
        dfs(root,0);
        return ans;
    }

    static void dfs(TreeNode node,int depth){
        if(node==null) return;
        if(depth>maxDepth){
            maxDepth = depth;
            ans = node.val;
        }
        dfs(node.left,depth+1);
        dfs(node.right,depth+1);
    }
}