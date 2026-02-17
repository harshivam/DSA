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
    ArrayList<TreeNode> list = new ArrayList<>();
    public void flatten(TreeNode root) {
        if(root==null) return ;
        preorder(root);
        TreeNode previousNode = list.get(0);
        
        int i = 1;
        while(i<list.size()){
            TreeNode currentNode = list.get(i);
            previousNode.left = null;
            previousNode.right = currentNode;
            previousNode = currentNode;i++;
        } 
        
    }
    void preorder(TreeNode root){
        if(root==null) return;
        list.add(root);
        preorder(root.left);
        preorder(root.right);
    }
}