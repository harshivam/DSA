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
    ArrayList<Integer> list = new ArrayList<>();
    public TreeNode balanceBST(TreeNode root) {
        Inorder(root);
        return solve(0,list.size()-1);

        
    }
    TreeNode solve(int l , int r){
        if(l>r) return null;
        int mid = (l+r)/2;
        TreeNode node = new TreeNode(list.get(mid));
        node.left = solve(l,mid-1);
        node.right = solve(mid+1,r);
        return node;
    }
    void Inorder(TreeNode root){
        if(root==null) return;
        Inorder(root.left);
        list.add(root.val);
        Inorder(root.right);
    }
}