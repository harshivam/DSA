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
    public TreeNode deleteNode(TreeNode root, int key) {
        return helper(root,key);
    }
    public int maxLeft(TreeNode node){
        if(node.right==null) return node.val;
        return maxLeft(node.right);

    }

    public TreeNode helper(TreeNode root, int key) {
        if (root == null)
            return null;
        if (key > root.val) {
            root.right = helper(root.right, key);
        } else if (key < root.val) {
            root.left = helper(root.left, key);
        } else {
            //if node has no child 
            if (root.right == null && root.left == null) {
                return null;
            }
            //if node has one child
            else if(root.right == null){
                return root.left;
            }
            else if(root.left == null){
                return root.right;
            }else{
                int maxLeft = maxLeft(root.left);
                root.val = maxLeft;
               root.left =  helper(root.left,maxLeft);
            }

        }
    return root;
    }
}