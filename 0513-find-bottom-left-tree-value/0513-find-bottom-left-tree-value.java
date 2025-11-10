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
    public int findBottomLeftValue(TreeNode root) {
        if(root.left==null && root.right==null) return root.val;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int ans = 0;
        while(!q.isEmpty()){
            TreeNode node = q.poll();
            if(node.right!=null) q.offer(node.right);
            if(node.left!=null) q.offer(node.left);
            ans = node.val;
            
        }
        return ans;
        
    }
    static int helper(TreeNode node ){
     if(node==null) return Integer.MIN_VALUE;

     int max = Math.max(helper( node.left),node.val);

     
     helper( node.right);
     return max;
    }
}