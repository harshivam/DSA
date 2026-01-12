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
    int depth = 0;
    HashMap<TreeNode,Integer> map = new HashMap<>();
    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        depth(root,0);
        return LCA(root);

        
    }

    TreeNode LCA(TreeNode root){
        if(root==null) return root;
        if(map.get(root)==depth) return root;
        
        TreeNode left = LCA(root.left);
        TreeNode right = LCA(root.right);

        if(right!=null && left!=null) return root;
        if(right!=null) return right;

        return left;
    }

    void depth(TreeNode root,int height){
        if(root==null) return;
        depth = Math.max(depth,height);
        map.put(root,height);
        depth(root.left,height+1);
        depth(root.right,height+1);

    }
}