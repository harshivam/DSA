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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root==null) return new TreeNode(val);
        insert(root,val);
        return root;
    }
    static void insert(TreeNode node, int val){
        if(val<node.val && node.left==null ){
            TreeNode n = new TreeNode(val);
            node.left = n;
            return;
        }
        if(val>node.val &&node.right==null){
            TreeNode n = new TreeNode(val);
            node.right = n;
            return;
        }
        if(val>node.val){
            insert(node.right,val);
        }
        else{
            insert(node.left,val);
        }
        return;
    }
}